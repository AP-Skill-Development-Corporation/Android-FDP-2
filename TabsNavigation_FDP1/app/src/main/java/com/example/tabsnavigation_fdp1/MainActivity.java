package com.example.tabsnavigation_fdp1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout ;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tablayout1);
        viewPager = findViewById(R.id.viewpager1);
         ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
         adapter.add(new ChatFragment(),"Chats");
         adapter.add(new OnlineFragment(),"Online");
         adapter.add(new CallFragment(),"Call");
         viewPager.setAdapter(adapter);
         tabLayout.setupWithViewPager(viewPager);


    }
}