package com.example.nguyenvancuong_thuchanh2_b1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private FragmentAdapter adapter;
    private ViewPager viewPager;
    private BottomNavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new FragmentAdapter(getSupportFragmentManager(),3);
        viewPager = findViewById(R.id.pager);
        navigationView = findViewById(R.id.nav);
        viewPager.setAdapter(adapter);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.i1:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.i2:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.i3:
                        viewPager.setCurrentItem(2);
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_option,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.close:
                System.exit(0);
                break;
            case R.id.info:
                startActivity(new Intent(MainActivity.this,InfoActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}