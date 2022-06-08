package com.vtmsoft.kts1_thanhdat;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnThoat;
    ImageView imv1,imv2,imv3,imv4,imv5;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();

        imv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(MainActivity.this, KT1Activity.class);
                startActivity(i);
            }
        });
        imv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(MainActivity.this, KT2Activity.class);
                startActivity(i);
            }
        });
        imv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(i);
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XuLyThoat();
            }
        });

    }

    private void XuLyThoat() {
        //Tạo đối tượng
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        //Thiết lập tiêu đề
        b.setTitle("Xác nhận");
        b.setMessage("Bạn có đồng ý thoát chương trình không?");
        // Nút Ok
        b.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
        //Nút Cancel
        b.setNegativeButton("Không đồng ý", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        //Tạo dialog
        AlertDialog al = b.create();
        //Hiển thị
        al.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.menu1:
                //code xử lý khi bấm menu1
                Toast.makeText(this, "Bạn vừa bấm vào menu 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2:
                //code xử lý khi bấm menu2
                Toast.makeText(this, "Bạn vừa bấm vào menu 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu3:
                //code xử lý khi bấm menu3
                i = new Intent(MainActivity.this, KT2Activity.class);
                startActivity(i);
                break;
            case R.id.menu4:
                //code xử lý khi bấm menu2
                Toast.makeText(this, "Bạn vừa bấm vào menu 4", Toast.LENGTH_SHORT).show();
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void addControls() {
        btnThoat = findViewById(R.id.btnThoat);
        imv1 = findViewById(R.id.imageView2);
        imv2 = findViewById(R.id.imageView3);
        imv3 = findViewById(R.id.imageView4);
        imv4 = findViewById(R.id.imageView5);
        imv5 = findViewById(R.id.imageView6);
    }
}
