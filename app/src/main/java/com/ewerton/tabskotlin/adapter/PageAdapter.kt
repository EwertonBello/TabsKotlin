package com.ewerton.tabskotlin.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.ewerton.tabskotlin.fragments.PrimeiroFragment
import com.ewerton.tabskotlin.fragments.SegundoFragment

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PrimeiroFragment()
            else -> {
                return SegundoFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Primeira Tab"
            else -> {
                return "Segunda Tab"
            }
        }
    }
}