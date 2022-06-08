package com.vtmsoft.kts1_thanhdat;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.vtmsoft.kts1_thanhdat.adapter.SanPhamAdapter;
import com.vtmsoft.kts1_thanhdat.model.SanPham;

public class ListView4Activity extends AppCompatActivity {
    ListView lvSanPham;
    SanPhamAdapter sanPhamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view4);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ListView Nâng Cao"); //Thiết lập tiêu đề nếu muốn
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        addControls();
        addEvents();
        fakeData();
    }

    private void fakeData() {
        sanPhamAdapter.add(new SanPham(R.drawable.h6,"Sản phẩm 1",60000));
        sanPhamAdapter.add(new SanPham(R.drawable.h7,"Sản phẩm 2",70000));
        sanPhamAdapter.add(new SanPham(R.drawable.h8,"Sản phẩm 3",75000));
        sanPhamAdapter.add(new SanPham(R.drawable.h9,"Sản phẩm 4",80000));
        sanPhamAdapter.add(new SanPham(R.drawable.h10,"Sản phẩm 5",50000));
        sanPhamAdapter.add(new SanPham(R.drawable.h11,"Sản phẩm 6",40000));
        sanPhamAdapter.add(new SanPham(R.drawable.h12,"Sản phẩm 7",20000));
        sanPhamAdapter.add(new SanPham(R.drawable.h13,"Sản phẩm 8",10000));
        sanPhamAdapter.add(new SanPham(R.drawable.h14,"Sản phẩm 9",65000));
        sanPhamAdapter.add(new SanPham(R.drawable.h15,"Sản phẩm 10",62000));
    }

    private void addEvents() {
        lvSanPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                SanPham sp = sanPhamAdapter.getItem(i);
                Toast.makeText(ListView4Activity.this, "Bạn chọn: "+sp.getTen(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void addControls() {
        lvSanPham = findViewById(R.id.lvSanPham);
        sanPhamAdapter = new SanPhamAdapter(ListView4Activity.this,R.layout.item);
        lvSanPham.setAdapter(sanPhamAdapter);
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
                Toast.makeText(this, "Bạn vừa bấm vào menu 3", Toast.LENGTH_SHORT).show();
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
