package com.example.tablayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/**
 * <pre>
 *     author : wyx
 *     time   : 2021/5/19 13:04
 * </pre>
 */
public class ScreenSlidePagerAdapter extends FragmentStateAdapter {
    private int NUM_PAGES = 2;
    public ScreenSlidePagerAdapter(FragmentActivity fa) {
        super(fa);
    }

    @Override
    public Fragment createFragment(int position) {
//        switch (position)
//        {
//            case 0:
//                return new OneFragment();
//
//            default:
//                return new OneFragment();
//        }
        return new OneFragment();
    }

    @Override
    public int getItemCount() {
        return NUM_PAGES;
    }

}
