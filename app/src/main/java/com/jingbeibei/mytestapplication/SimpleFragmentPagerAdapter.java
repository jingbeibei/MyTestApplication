package com.jingbeibei.mytestapplication;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by 景贝贝 on 2016/8/18.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private static final String[] mTitles = {"tab1", "tab2", "tab3"};

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
