package com.example.wishlistapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3;
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return MoviesFragment()
            }
            // 1 -> {
            //     return Fragment2()
            // }
            // 2 -> {
            //     return Fragment3()
            // }
            else -> {
                return MoviesFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "Movies"
            }
            1 -> {
                return "Music"
            }
            2 -> {
                return "Books"
            }
        }
        return super.getPageTitle(position)
    }

}