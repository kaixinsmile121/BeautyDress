package com.example.beautydress.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beautydress.Adapter.HomeAdapter;
import com.example.beautydress.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Djc on 2016/7/6.
 */
public class TabHomeFragment extends Fragment {
    private View view;
    private TabLayout tl;
    private ViewPager viewPager;
    private List<Fragment> fragments;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = (View) inflater.inflate(R.layout.tab_home_layout, null);
        tl = (TabLayout) view.findViewById(R.id.tl_id);
        viewPager=(ViewPager)view.findViewById(R.id.home_viewpager);
        fragments=new ArrayList<Fragment>();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String[] tabsName= getResources().getStringArray(R.array.tabsName);
        for (String tabName:tabsName) {
            tl.addTab(tl.newTab().setText(tabName));
        }
        fragments.add(new RecommendFragment());
        fragments.add(new WomenDressFragment());
        fragments.add(new ShoesBagFragment());
        fragments.add(new MenDressFragment());
        fragments.add(new OlderFragment());
        fragments.add(new ChildFragment());
        fragments.add(new BeautyFragment());
        tl.setupWithViewPager(viewPager);
        viewPager.setAdapter(new HomeAdapter(getFragmentManager(),tabsName,fragments));
    }
}