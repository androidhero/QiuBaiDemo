package com.qianfeng.qiubaidemo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qianfeng.qiubaidemo.R;
import com.qianfeng.qiubaidemo.adapters.QiuShiFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoChao
 * Date 15-12-30
 */
public class QiuShiFragment  extends Fragment{
    private TabLayout tabLayout;
    private List<Fragment> fragments;
    private List<String> list;
    private ViewPager viewPager;

    public QiuShiFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_qiushi,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list=new ArrayList<>();
        list.add("专享");
        list.add("视频");
        list.add("纯文");
        list.add("精华");

        fragments=new ArrayList<>();
        for(String arg:list){
            fragments.add(CommonFragment.newInstance(arg));
        }
        viewPager = (ViewPager) view.findViewById(R.id.pager);
        tabLayout= (TabLayout) view.findViewById(R.id.tab);
        QiuShiFragmentAdapter adapter=new QiuShiFragmentAdapter(getChildFragmentManager(),fragments,list);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
