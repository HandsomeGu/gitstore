package Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import bean.StockList;
import sss.gqd.com.stockquery.R;

/**
 * Created by guquanding on 2017/5/24.
 */

public class StockListAdapter extends BaseAdapter {

    private Context context;
    private List<StockList.ResultBean.DataBean> list;

    public StockListAdapter(Context context, List<StockList.ResultBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder ;
        if(convertView==null){
            convertView = View.inflate(context, R.layout.listview_item,null);
            viewHolder = new ViewHolder();
            viewHolder.name = (TextView) convertView.findViewById(R.id.stockname);
            viewHolder.time = (TextView) convertView.findViewById(R.id.time);
            viewHolder.trade = (TextView) convertView.findViewById(R.id.trade);
            viewHolder.pricechangde = (TextView) convertView.findViewById(R.id.pricechangde);
            viewHolder.changepercent = (TextView) convertView.findViewById(R.id.changepercent);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        StockList.ResultBean.DataBean dataBean = list.get(position);
        viewHolder.name.setText(dataBean.getName());
        viewHolder.trade.setText(dataBean.getTrade());
        viewHolder.time.setText(dataBean.getTicktime());
        if(Double.valueOf(dataBean.getPricechange())<0){
            viewHolder.pricechangde.setTextColor(Color.RED);
        }else{
            viewHolder.pricechangde.setTextColor(Color.GREEN);
        }
        viewHolder.pricechangde.setText(dataBean.getPricechange());
        if(Double.valueOf(dataBean.getChangepercent())<0){
            viewHolder.changepercent.setTextColor(Color.RED);
        }else{
            viewHolder.changepercent.setTextColor(Color.GREEN);
        }
        viewHolder.changepercent.setText(dataBean.getChangepercent());

        return convertView;
    }

    static class ViewHolder{
      TextView name;
      TextView time;
      TextView trade;
      TextView pricechangde;
      TextView changepercent;
    }
}
