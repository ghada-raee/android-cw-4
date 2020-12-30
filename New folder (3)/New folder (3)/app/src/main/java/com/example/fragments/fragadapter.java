package com.example.fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fragments.frag.frag1;
import com.example.fragments.frag.frag2;
import com.example.fragments.frag.frag3;

public class fragadapter extends FragmentPagerAdapter {


    public fragadapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new frag1();
            case 1:
                return new frag2();
            case 2:
                return new frag3();
        }
        return null;

    }

    @Override
    public int getCount() {
        return 3;
    }
}
