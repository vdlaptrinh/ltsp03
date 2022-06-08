package com.vtmsoft.kts1_thanhdat;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListView1Activity extends AppCompatActivity {
    Intent i;
    ListView lvData1;
    String []arrData = {"Hà Nội", "Huế", "Đà Nẵng", "Sài Gòn", "Cần Thơ", "Đà Lạt", "Tây Ninh","Buôn ma thuột", "Nha Trang", "Phan Thiết","Vinh","Quảng Ninh","Tiền Giang"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view1);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ListView 1"); //Thiết lập tiêu đề nếu muốn
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        addControls();
        addEvents();
    }

    private void addEvents() {
        lvData1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListView1Activity.this, "Bạn chọn: " + arrData[i], Toast.LENGTH_LONG).show();
            }
        });
    }

    private void addControls() {
        lvData1 = findViewById(R.id.lvData1);
        //tạo adapter
        adapter = new ArrayAdapter<String>(ListView1Activity.this, android.R.layout.simple_list_item_1,arrData);
        //gán adapter cho listview
        lvData1.setAdapter(adapter);
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
                i = new Intent(ListView1Activity.this, KT2Activity.class);
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
}
