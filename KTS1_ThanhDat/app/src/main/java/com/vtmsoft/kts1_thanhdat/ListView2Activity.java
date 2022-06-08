package com.vtmsoft.kts1_thanhdat;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ListView2Activity extends AppCompatActivity {
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ListView 2"); //Thiết lập tiêu đề nếu muốn
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
                i = new Intent(ListView2Activity.this, KT2Activity.class);
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
