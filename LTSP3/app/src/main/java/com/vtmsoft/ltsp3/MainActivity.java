package com.vtmsoft.ltsp3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("LỊCH HỌC");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_action_name);

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
                openActivity1();
                break;
            case R.id.menu2:
                //code xử lý khi bấm menu2
                openActivity2();
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
    private void openActivity1() {
        intent = new Intent(this, Main1Activity.class);
        startActivity(intent);
    }

    private void openActivity2() {
        intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}
