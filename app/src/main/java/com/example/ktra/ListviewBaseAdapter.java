package com.example.ktra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class ListviewBaseAdapter extends BaseAdapter {

    Context context;
    ArrayList<ListviewModel> listviewData;
    LayoutInflater layoutInflater;
    ListviewModel listviewModel;

    public ListviewBaseAdapter(Context context, ArrayList<ListviewModel> countriesData) {
        this.context = context;
        this.listviewData = countriesData;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listviewData.size();
    }

    @Override
    public Object getItem(int position) {
        return listviewData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;
        if (rowView==null) {
            rowView = layoutInflater.inflate(R.layout.list_row, null, true);
        }
        listviewModel = listviewData.get(position);

        //link views
        ImageView productImg = rowView.findViewById(R.id.imageSanPham);
        TextView productName = rowView.findViewById(R.id.textviewTenSP);
        TextView freeship = rowView.findViewById(R.id.textviewFreeship);
        TextView productTien = rowView.findViewById(R.id.textviewTien);

        productImg.setImageResource(listviewModel.getImage());
        productName.setText(listviewModel.getTenSP());
        freeship.setText(listviewModel.getFreeShip());
        productTien.setText(listviewModel.getTienSP());

        return rowView;
    }
}
