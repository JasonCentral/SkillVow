package com.visionvow.skillvow;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.visionvow.skillvow.Pages.*;

import com.visionvow.skillvow.Pages.Overview;

public class MainActivity extends AppCompatActivity {

    private TabLayout mainTabs;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainTabs = findViewById(R.id.main_tabs);
        viewPager = findViewById(R.id.view_pager);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        //Adding fragments to adapter to become tabs
        adapter.addFragment(new Overview(), "Overview");
        adapter.addFragment(new Plan(), "Plan");
        adapter.addFragment(new Practice(), "Practice");
        adapter.addFragment(new Progress(), "Progress");
        adapter.addFragment(new Stats(), "Stats");
        viewPager.setAdapter(adapter);
        mainTabs.setupWithViewPager(viewPager);
    }
}
