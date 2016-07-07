package com.example.beautydress.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;

import java.util.List;

/**
 * Created by Djc on 2016/7/6.
 */
public class HomeAdapter extends FragmentPagerAdapter {
    private String[] titles;
    private FragmentTransaction transaction;
    private List<Fragment> fragments;
    public HomeAdapter(FragmentManager fr, String[] titles, List<Fragment> fragments){
       super(fr);
        this.titles=titles;
        this.fragments=fragments;
    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
