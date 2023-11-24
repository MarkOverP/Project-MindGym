package com.example.mindgym;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImgAdapterMainPage extends BaseAdapter {
    public Integer []mThumbIds = new Integer[3];
    private Context mContext;

    public ImgAdapterMainPage(Context mContext) {
        this.mContext = mContext;
        initMThumbIds();
    }

    public void initMThumbIds(){
        mThumbIds[0] = R.drawable.download3;
        mThumbIds[1] = R.drawable.download4;
        mThumbIds[2] = R.drawable.download5;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return mThumbIds[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i,View view, ViewGroup viewGroup) {
        ImageView iv = new ImageView(mContext);
        iv.setImageResource(mThumbIds[i]);
        iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
        iv.setLayoutParams(new ViewGroup.LayoutParams(300,300));
        return iv;
    }
}
