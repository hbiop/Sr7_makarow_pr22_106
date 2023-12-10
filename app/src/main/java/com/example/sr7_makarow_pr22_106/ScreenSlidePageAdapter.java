package com.example.sr7_makarow_pr22_106;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ScreenSlidePageAdapter extends FragmentStateAdapter {
    public ScreenSlidePageAdapter(MainActivity mainActivity) {
        super(mainActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
                return new onBoard1();
            case 1:
                return new onBoard2();
            case 2:
                return new onBoard3();
            default:
                return null;
        }
    }
    @Override
    public int getItemCount() {
        return 3;
    }
}
