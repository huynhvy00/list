package com.example.ktra;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        listView.setOnItemLongClickListener(new ItemLongClickRemove()); //Gọi lại sự kiện xóa
    }
    //Sự kiện xóa 1 list
    private class ItemLongClickRemove implements AdapterView.OnItemLongClickListener {
        @Override
        public boolean onItemLongClick(AdapterView parent, View view, final int position, long id) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder.setMessage("Bạn có muốn xóa sản phẩm này không?");
            alertDialogBuilder.setNegativeButton("Có", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "Xóa thành công", Toast.LENGTH_SHORT).show();
                    listviewData.remove(position);
                    adapter.notifyDataSetChanged();
                }
            });
            alertDialogBuilder.setPositiveButton("Không", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            alertDialogBuilder.show();
            return true;
        }
    }
}