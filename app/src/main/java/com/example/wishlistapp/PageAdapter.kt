package com.example.wishlistapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

private val MOVIES_LIST = arrayListOf("Inception", "Titanic", "Avatar", "Gladiator", "Jaws")
private val MUSIC_LIST = arrayListOf("Hello", "Imagine", "Stay", "Happy", "Halo", "Sorry", "Royals", "Shake", "Faded", "Stayin' Alive")
private val BOOKS_LIST = arrayListOf("1984", "It", "Dune", "Promessi sposi", "Beloved", "Dracula", "Frankenstein", "La divina commedia")


class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3;
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return ContentFragment.newInstance(stringList = MOVIES_LIST)
            }
            1 -> {
                return ContentFragment.newInstance(stringList = MUSIC_LIST)
            }
            2 -> {
                return ContentFragment.newInstance(stringList = BOOKS_LIST)
            }
            else -> {
                return ContentFragment()
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