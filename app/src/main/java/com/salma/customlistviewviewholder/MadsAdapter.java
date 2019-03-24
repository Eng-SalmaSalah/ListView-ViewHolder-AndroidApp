package com.salma.customlistviewviewholder;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MadsAdapter extends ArrayAdapter {
    private List<Mad> _mads;
    private Context _context;
    private int _resource;
    private static int _counter;

    public MadsAdapter(Context context, List<Mad> mads) {
        super(context, R.layout.singlerow, R.id.textName, mads);
        _mads = mads;
        _context = context;
        _resource = R.layout.singlerow;
        _counter = 0;
    }


    @Override
    public View getView(int position, View currentView, ViewGroup listView) {
        ViewHolder viewHolder;
        View row = currentView;
        if (row == null) {
            _counter++;
            LayoutInflater layoutInflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(_resource, listView, false);
            viewHolder = new ViewHolder(row);
            row.setTag(viewHolder);
            Log.i("counter", Integer.toString(_counter));
        }
        else
        {
            viewHolder=(ViewHolder) row.getTag();
            Log.i("counter", "rows recycled");
        }

        ImageView imageMad = viewHolder.getImageIcon();
        TextView nameMad = viewHolder.getTxtName();
        TextView descMad = viewHolder.getTxtDesc();
        imageMad.setImageResource(_mads.get(position).getImageID());
        nameMad.setText(_mads.get(position).getName());
        descMad.setText(_mads.get(position).getDesc());
        return row;
    }
}
