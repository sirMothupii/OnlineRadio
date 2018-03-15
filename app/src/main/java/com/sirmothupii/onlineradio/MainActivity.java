package com.sirmothupii.onlineradio;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    //declaring the arrays of the string images
    private String[] images = new String[]
            {
                    //enter the slide images URL here
            };

            //pager and adapter variables here
            ViewPager viewPager = (ViewPager) findViewById(viewPager);
            ViewPageAdapter adapter;
            
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find view by id via the view pager method
        adapter = new ViewPageAdapter(MainActivity.this, images);
        viewPager.setAdapter(adapter);
    }

    private void findViewById(ViewPager viewPager)
    {

    }

    public void onClickDashboard(View view)
    {
        Intent intent1 = new Intent(this, Dashboard.class);
        startActivity(intent1);
    }
}
