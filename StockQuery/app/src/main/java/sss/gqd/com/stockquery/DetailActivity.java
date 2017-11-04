package sss.gqd.com.stockquery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

import Adapter.PicListAdapter;
import Connection.ConnectionUtil;
import Connection.ResponseListener;
import bean.StockDetail;
import butterknife.Bind;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    /**
     *  使用插件ButterKnife生成
     */
    @Bind(R.id.name)  //股票名称
    TextView name;
    @Bind(R.id.todayStartPri)  //今日开盘价
    TextView todayStartPri;
    @Bind(R.id.nowPri)  //当前价格
    TextView nowPri;
    @Bind(R.id.yestodEndPri)  //昨日收盘价
    TextView yestodEndPri;
    @Bind(R.id.increPer)   //涨跌百分比
    TextView increPer;
    @Bind(R.id.increase)   //涨跌额
    TextView increase;
    @Bind(R.id.todayMax)   //今日最高价
    TextView todayMax;
    @Bind(R.id.todayMin)   //今日最低价
    TextView todayMin;
    @Bind(R.id.competitivePri)   //竞买价
    TextView competitivePri;
    @Bind(R.id.reservePri)   //竞卖价
    TextView reservePri;
    @Bind(R.id.traNumber)   //成交量
    TextView traNumber;
    @Bind(R.id.traAmount)   //成交金额
    TextView traAmount;
    @Bind(R.id.buyOne)   //买一
    TextView buyOne;
    @Bind(R.id.buyOnePri)  //买一报价
    TextView buyOnePri;
    @Bind(R.id.sellOne)  //卖一
    TextView sellOne;
    @Bind(R.id.sellOnePri)  //卖一报价
    TextView sellOnePri;
    @Bind(R.id.data)   //时间
    TextView data;
    @Bind(R.id.piclist) //K线图
    ListView picList;
    private StockDetail stockDetail;
    private StockDetail.ResultBean resultBean;
    private StockDetail.ResultBean.DataBean dataBeen;
    private StockDetail.ResultBean.GopictureBean gopictureBeen;
    private List<String> picurlList;
    private PicListAdapter picListAdapter;
    private TextView symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        symbol = (TextView) findViewById(R.id.stock_symbol);
        symbol.setText( getIntent().getStringExtra("number"));
        String url="http://web.juhe.cn:8080/finance/stock/hs?gid=" + getIntent().getStringExtra("number") + "&key=5010ac44ea0385afe573d7213be68407";
        ConnectionUtil.sendRequest(url, new ResponseListener() {
            @Override
            public void onSuccess(Object object) {
                stockDetail = (StockDetail) object;
                resultBean = stockDetail.getResult().get(0);
                dataBeen = resultBean.getData();
                gopictureBeen = resultBean.getGopicture();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                name.setText(dataBeen.getName());
                                todayStartPri.setText(dataBeen.getTodayStartPri());
                                nowPri.setText(dataBeen.getNowPri());
                                yestodEndPri.setText(dataBeen.getYestodEndPri());
                                increPer.setText(dataBeen.getIncrePer());
                                increase.setText(dataBeen.getIncrease());
                                todayMax.setText(dataBeen.getTodayMax());
                                todayMin.setText(dataBeen.getTodayMin());
                                competitivePri.setText(dataBeen.getCompetitivePri());
                                reservePri.setText(dataBeen.getReservePri());
                                traNumber.setText(dataBeen.getTraNumber());
                                traAmount.setText(dataBeen.getTraAmount());
                                buyOne.setText(dataBeen.getBuyOne());
                                buyOnePri.setText(dataBeen.getBuyOnePri());
                                sellOne.setText(dataBeen.getSellOne());
                                sellOnePri.setText(dataBeen.getSellOnePri());
                                data.setText(dataBeen.getDate());
                            }
                        });
                    picurlList = new ArrayList<>();
                    picurlList.add(gopictureBeen.getMinurl());
                    picurlList.add(gopictureBeen.getDayurl());
                    picurlList.add(gopictureBeen.getWeekurl());
                    picurlList.add(gopictureBeen.getMonthurl());
                    picListAdapter = new PicListAdapter(DetailActivity.this,picurlList);
                    runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        picList.setAdapter(picListAdapter);
                    }
                });
            }

            @Override
            public void onError(String errorMsg) {

        }
      },StockDetail.class);

        }
}




