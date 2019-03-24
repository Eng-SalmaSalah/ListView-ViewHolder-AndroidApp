package com.salma.customlistviewviewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {
    private View currentView;
    private ImageView imgIcon;
    private TextView txtName;
    private TextView txtDesc;

    public ViewHolder(View currentView) {
        this.currentView = currentView;
    }

    public ImageView getImageIcon(){
        if(imgIcon==null)
            imgIcon=currentView.findViewById(R.id.imgMad);
        return imgIcon;
    }

    public TextView getTxtName(){
        if(txtName==null)
            txtName=currentView.findViewById(R.id.textName);
        return txtName;
    }

    public TextView getTxtDesc(){
        if(txtDesc==null)
            txtDesc=currentView.findViewById(R.id.textDesc);
        return txtDesc;
    }
}
