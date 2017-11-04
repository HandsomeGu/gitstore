package sss.gqd.com.stockquery;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.SupportMenuInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Adapter.StockListAdapter;
import Connection.ConnectionUtil;
import Connection.ResponseListener;
import bean.StockList;
import greenDao.GreenDaoHelper;
import greenDao.StockSave;
import greenDao.StockSaveDao;

public class MainActivity extends AppCompatActivity {

    private List<StockList.ResultBean.DataBean> list;
    private ListView listView;
    private Button button1;
    private Button button2;
    private Spinner spinner;
    private StockListAdapter adapter;
    private StockSaveDao stockSaveDao;
    private int page = 20;
    private String city = "sz";
    private String[] cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        initView();
        //初始化数据库
        GreenDaoHelper.initDataBase(MainActivity.this);
        stockSaveDao = GreenDaoHelper.getmDaoSession().getStockSaveDao();
        getInfo(1,city);
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.listview);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage("是否删除股票?")
                        .setNegativeButton("否", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setPositiveButton("是", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                list.remove(position);
                                adapter.notifyDataSetChanged();
                            }
                        }).show();
                  return true;
            }
        });

         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             StockList.ResultBean.DataBean dataBean = list.get(position);
             StockSave stockSave = new StockSave(null,dataBean.getName(),dataBean.getTrade(),dataBean.getTicktime(),dataBean.getPricechange(),dataBean.getChangepercent(),dataBean.getSymbol());
             StockSave s = stockSaveDao.queryBuilder().where(StockSaveDao.Properties.Stockname.eq(dataBean.getName())).build().unique();
             if(s==null) {
                 stockSaveDao.insert(stockSave);
             }
             Intent intent = new Intent(MainActivity.this,DetailActivity.class);
             intent.putExtra("number",list.get(position).getSymbol());
             startActivity(intent);
         }
     });
     button1 = (Button) findViewById(R.id.button1);
     button1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             page --;
             getInfo(page,city);
         }
     });

    button2 = (Button) findViewById(R.id.button2);
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            page++;
            getInfo(page,city);
        }
      });

        spinner = (Spinner) findViewById(R.id.spinner);
        String arr[] = {"深股列表","沪股列表"};
        cities = new String[]{"sz", "sh"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,R.layout.myspinner,arr);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                city =cities[position];
                getInfo(page,city);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new SupportMenuInflater(this);
        menuInflater.inflate(R.menu.savemenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.savemenu){
            Intent intent = new Intent(MainActivity.this,SaveActivity.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.search){
            final LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(R.layout.searchdialog,null);
            new AlertDialog.Builder(this)
                    .setTitle("股票搜索")
                    .setView(linearLayout)
                    .setPositiveButton("搜索", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            EditText editText = (EditText) linearLayout.findViewById(R.id.stockSearchName);
                            String symbol = editText.getText().toString();
                            String regex = "^(?i)s[hz]\\d{6}$";
                            Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
                            Matcher m = p.matcher(symbol);
                            boolean result = m.find();
                            if(result) {
                                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                                intent.putExtra("number", symbol);
                                startActivity(intent);
                            }else {
                                Toast.makeText(MainActivity.this, "获取失败，请检查股票代码是否正确", Toast.LENGTH_LONG).show();
                            }
                        }
                    })
                    .setNegativeButton("取消",null)
                    .create()
                    .show();
        }
        return true;
    }

    public void getInfo(int page,String city){
        ConnectionUtil.sendRequest("http://web.juhe.cn:8080/finance/stock/"+city+"all?key=5010ac44ea0385afe573d7213be68407&page="+page, new ResponseListener() {
            @Override
            public void onSuccess(Object object) {
                StockList stockList = (StockList) object;
                StockList.ResultBean resultBean = stockList.getResult();
                list = resultBean.getData();
                adapter =new StockListAdapter(MainActivity.this,list);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        listView.setAdapter(adapter);
                    }
                });
            }
            @Override
            public void onError(String errorMsg) {
            }
        },StockList.class);
    }
}

