package sss.gqd.com.stockquery;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import Adapter.StockListAdapter;
import bean.StockList;
import greenDao.GreenDaoHelper;
import greenDao.StockSave;
import greenDao.StockSaveDao;

public class SaveActivity extends AppCompatActivity {

    private StockSaveDao stockSaveDao;
    private StockSave stockSave;
    private List<StockSave> stockList;
    private ListView listView;
    private List<StockList.ResultBean.DataBean> dataBeanList;
    private StockList.ResultBean.DataBean dataBean;
    private StockListAdapter adapter;
    private  int MEUN = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);
        listView = (ListView) findViewById(R.id.saveList);

        GreenDaoHelper.initDataBase(SaveActivity.this);
        stockSaveDao = GreenDaoHelper.getmDaoSession().getStockSaveDao();

        initView();
    }

    private void initView() {

        dataBeanList = new ArrayList<>();
        stockList = stockSaveDao.loadAll();

        for(int i = 0; i<stockList.size();i++){
            dataBean = new StockList.ResultBean.DataBean();
            stockSave =  stockList.get(i);
            dataBean.setName(stockSave.getStockname());
            dataBean.setTicktime(stockSave.getTime());
            dataBean.setTrade(stockSave.getTrade());
            dataBean.setChangepercent(stockSave.getChangepercent());
            dataBean.setPricechange(stockSave.getRicechangde());
            dataBean.setSymbol(stockSave.getSysmbol());
            dataBeanList.add(dataBean);
        }
        adapter = new StockListAdapter(SaveActivity.this,dataBeanList);
        listView.setAdapter(adapter);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                new AlertDialog.Builder(SaveActivity.this)
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
                                StockSave s = stockSaveDao.queryBuilder().where(StockSaveDao.Properties.Stockname.eq(dataBeanList.get(position).getName())).build().unique();
                                stockSaveDao.deleteByKey(s.getId());
                                dataBeanList.remove(position);
                                adapter.notifyDataSetChanged();
                            }
                        }).show();
                return  true;
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SaveActivity.this,DetailActivity.class);
                intent.putExtra("number",dataBeanList.get(position).getSymbol());
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,MEUN,0,"清空记录");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == MEUN) {
            stockSaveDao.deleteAll();
            for(int i =dataBeanList.size()-1;i>=0;i--){
                dataBeanList.remove(i);
            }
            adapter.notifyDataSetChanged();
        }
        return  true;
    }
}
