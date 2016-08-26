package grmi.org.androidmixer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Jeremy on 26/08/2016.
 */
public class TracksListAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private Context mContext;

    public TracksListAdapter(Context context)
    {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return 150;
    }

    @Override
    public Object getItem(int position) {
        return "coucou";
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout layoutItem;
        if (convertView == null) {
            layoutItem = (LinearLayout) mInflater.inflate(R.layout.tracklayout, parent, false);
        } else {
            layoutItem = (LinearLayout) convertView;
        }
        TextView txtView = (TextView)layoutItem.findViewById(R.id.textView);
        txtView.setText("cooucou");
        return layoutItem;
    }
}
