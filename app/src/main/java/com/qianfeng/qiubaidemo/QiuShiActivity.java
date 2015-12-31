package com.qianfeng.qiubaidemo;

import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableLayout;

import com.qianfeng.qiubaidemo.fragments.QiuShiFragment;

import java.util.ArrayList;
import java.util.List;

public class QiuShiActivity extends AppCompatActivity implements SlidingPaneLayout.PanelSlideListener, NavigationView.OnNavigationItemSelectedListener {

    private SlidingPaneLayout slidingPaneLayout;
    private NavigationView menu;

    private FragmentTransaction transaction;
    private QiuShiFragment qiuShiFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qiu_shi);
        slidingPaneLayout = (SlidingPaneLayout) findViewById(R.id.window);
        menu = (NavigationView) findViewById(R.id.menu);

        menu.setNavigationItemSelectedListener(this);
        menu.setNavigationItemSelectedListener(this);
        transaction = getSupportFragmentManager().beginTransaction();
        qiuShiFragment = new QiuShiFragment();
        transaction.replace(R.id.fragment_container, qiuShiFragment);
        transaction.commit();

    }
    //滑动中
    @Override
    public void onPanelSlide(View panel, float slideOffset) {
    }

    @Override
    public void onPanelOpened(View panel) {
    }

    @Override
    public void onPanelClosed(View panel) {

    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        return false;
    }
}
