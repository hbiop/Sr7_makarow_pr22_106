package com.example.sr7_makarow_pr22_106;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.window.SplashScreen;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private static final int NumPages = 3;
    private ViewPager2 viewPager2;
    private FragmentStateAdapter fragmentStateAdapter;
    TextView skip;
    Button btn;
    public int position = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Sr7_makarow_pr22_106);
        setContentView(R.layout.activity_main);
        //skip = (TextView) findViewById(R.id.skip);
        //btn = findViewById(R.id.button3);
        //btn.setOnClickListener(this);
        //skip.setOnClickListener(MainActivity.this);
        viewPager2 = findViewById(R.id.pager);
        fragmentStateAdapter = new ScreenSlidePageAdapter(this);
        viewPager2.setAdapter(fragmentStateAdapter);
        //viewPager2.setCurrentItem(1);

    }
public void fm()
{
    Fragment fragment = new onBoard1();
    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction transaction = fm.beginTransaction();
    transaction.replace(R.id.layoout_onboard1, fragment);
    transaction.commit();
}
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            //case R.id.skip:
             //   viewPager2.setCurrentItem(3);
            //case R.id.button3:
                //viewPager2.setCurrentItem(3);
        }
    }

    public void onSkip(View view) {
        viewPager2.setCurrentItem(3);
    }

    public void onEnd(View view) {
        startActivity(new Intent(MainActivity.this, SignIn.class));
    }
}