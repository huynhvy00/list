package com.example.ktra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ListviewBaseAdapter adapter;
    ArrayList<ListviewModel> listviewData;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        listviewData = new ArrayList<>();

        listviewData.add(new ListviewModel(R.drawable.vin, "Vinmart", "Chuỗi siêu thị uy tín, sản phẩm đa dạng, vận chuyển siêu tốc", "Tích 5%"));
        listviewData.add(new ListviewModel(R.drawable.vin, "Bác Tôm", "Chuỗi siêu thị uy tín, sản phẩm đa dạng, vận chuyển siêu tốc", "Tích 3%"));
        listviewData.add(new ListviewModel(R.drawable.vin, "Vinmart", "Chuỗi siêu thị uy tín, sản phẩm đa dạng, vận chuyển siêu tốc", "Tích 5%"));
        listviewData.add(new ListviewModel(R.drawable.vin, "Bác Tôm", "Chuỗi siêu thị uy tín, sản phẩm đa dạng, vận chuyển siêu tốc", "Tích 3%"));
        listviewData.add(new ListviewModel(R.drawable.vin, "Vinmart", "Chuỗi siêu thị uy tín, sản phẩm đa dạng, vận chuyển siêu tốc", "Tích 5%"));
        listviewData.add(new ListviewModel(R.drawable.vin, "Bác Tôm", "Chuỗi siêu thị uy tín, sản phẩm đa dạng, vận chuyển siêu tốc", "Tích 3%"));

        adapter = new ListviewBaseAdapter(this, listviewData);

        listView.setAdapter(adapter);
    }

}