package com.example.sr7_makarow_pr22_106;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private static final int NumPages = 3;
    private ViewPager2 viewPager2;
    private FragmentStateAdapter fragmentStateAdapter;
    TextView skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        skip = (TextView) findViewById(R.id.skip);
        skip.setOnClickListener(MainActivity.this);
        viewPager2 = findViewById(R.id.pager);
        fragmentStateAdapter = new ScreenSlidePageAdapter(this);
        viewPager2.setAdapter(fragmentStateAdapter);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.skip:
                Log.d("MyLog","click");
                Toast.makeText(this,"aaaaaaa", Toast.LENGTH_LONG);
                break;
        }
    }

}