package com.example.nguyenvancuong_thuchanh2_b1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.nguyenvancuong_thuchanh2_b1.fragment.Fragment1;
import com.example.nguyenvancuong_thuchanh2_b1.fragment.Fragment2;
import com.example.nguyenvancuong_thuchanh2_b1.fragment.Fragment3;

public class FragmentAdapter extends FragmentStatePagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Fragment1();
            case 1: return new Fragment2();
            case 2: return new Fragment3();
        }
        return new Fragment1();
    }
    @Override
    public int getCount() {
        return 3;
    }
}
