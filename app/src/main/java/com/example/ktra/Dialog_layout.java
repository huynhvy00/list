package com.example.ktra;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Dialog_layout extends AppCompatActivity {
        private Button btnShow;
        private Button btnShowAlert;
        Dialog dialog;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            btnShow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showDialog();
                }
            });
            btnShowAlert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showAlertDialog();
                }
            });
        }

        private void showAlertDialog() {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Thongbao");
            builder.setMessage("Bạn có muốn xóa không?");
            builder.setCancelable(true);
            builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(Dialog_layout.this, "Ban đã xóa thành công!", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }
            });
            builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();



        }


        public void showDialog(){
            dialog  = new Dialog(Dialog_layout.this);
            dialog.setTitle("Thông báo");
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.layoutdialog);
            Button btnDongY = (Button) dialog.findViewById(R.id.btn_dong_y);
            Button btnUChiu = (Button) dialog.findViewById(R.id.btn_khong);

            btnDongY.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Dialog_layout.this, "Ban đã xóa thành công!", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }
            });
            btnUChiu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });
            dialog.show();
        }
    }
