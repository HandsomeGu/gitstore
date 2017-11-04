package Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import bean.StockDetail;
import imageutil.SmartImageView;
import sss.gqd.com.stockquery.R;


/**
 * Created by guquanding on 2017/5/24.
 */

public class PicListAdapter extends BaseAdapter {

    private Context context;
    private List<String> piclist;
    private List<String> Kname;

    public PicListAdapter(Context context, List<String> piclist) {
        this.context = context;
        this.piclist = piclist;
    }

    @Override
    public int getCount() {
        return piclist.size();
    }

    @Override
    public Object getItem(int position) {
        return piclist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder ;
        if(convertView==null){
            convertView = View.inflate(context,R.layout.listview_picdetial,null);
            viewHolder = new ViewHolder();
            viewHolder.style = (TextView) convertView.findViewById(R.id.style);
            viewHolder.picture = (SmartImageView) convertView.findViewById(R.id.pic);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        Kname = new ArrayList<>();
        Kname.add("分时K线图");
        Kname.add("日K线图");
        Kname.add("周K线图");
        Kname.add("月K线图");
        viewHolder.style.setText(Kname.get(position));
        viewHolder.picture.setImageUrl(piclist.get(position));
        return convertView;
    }
    private  class ViewHolder{
        TextView style;
        SmartImageView picture;
    }
}
