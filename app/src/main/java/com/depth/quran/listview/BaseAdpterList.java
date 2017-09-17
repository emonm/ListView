package com.depth.quran.listview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Emon on 10/4/2016.
 */

public class BaseAdpterList extends BaseAdapter {

    String names[];
    String phones[];
    int imd[];

    Context mContext;

    public  BaseAdpterList(Context montext,String[]namesz,String[]phonesz,int[]imsd)
    {
        names=namesz;
        phones=phonesz;
        imd=imsd;
        this.mContext=montext;
    }

    @Override
    public int getCount() {
        return names.length;
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

        LayoutInflater   inflater = (LayoutInflater)mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);


        convertView = inflater.inflate(R.layout.row_list, null);


        TextView name=(TextView)convertView.findViewById(R.id.name);
        TextView phone=(TextView)convertView.findViewById(R.id.tvphone);
        ImageView imageview=(ImageView)convertView.findViewById(R.id.imageview);



        name.setText(names[position]);
        phone.setText(phones[position]);
        imageview.setImageResource(imd[position]);

        return convertView;
    }
}
