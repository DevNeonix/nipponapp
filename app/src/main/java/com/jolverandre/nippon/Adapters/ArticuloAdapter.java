package com.jolverandre.nippon.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.jolverandre.nippon.Models.Articulo;

import java.util.List;

public class ArticuloAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Articulo> list;

    public ArticuloAdapter(Context context, int layout, List<Articulo> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(layout,viewGroup,false);
        }



        return view;
    }
}
