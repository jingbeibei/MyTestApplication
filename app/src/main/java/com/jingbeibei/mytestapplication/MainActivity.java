package com.jingbeibei.mytestapplication;


import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
private SimpleFragmentPagerAdapter  pagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pagerAdapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager(), this);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.addTab(tabLayout.newTab().setText("主页"));
//        tabLayout.addTab(tabLayout.newTab().setText("1"));
//        tabLayout.addTab(tabLayout.newTab().setText("2"));

        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
      TabLayout.Tab one=tabLayout.getTabAt(0);
      TabLayout.Tab  two=tabLayout.getTabAt(1);
        TabLayout.Tab three =tabLayout.getTabAt(3);
        one.setIcon(R.drawable.selector_menu_home);
        two.setIcon(R.mipmap.ic_launcher);
        three.setCustomView(R.layout.item_tab_layout_custom);


    }

}
