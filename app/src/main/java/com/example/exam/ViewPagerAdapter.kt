package com.example.exam

import android.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.exam.FirstTabFragment
import com.example.exam.SecondTabFragment

class ViewPagerAdapter(fragment: Fragment) :FragmentStateAdapter(fragment){
    private val mFragmentList: MutableList<Fragment> = ArrayList()
    private val mFragmentTitleList: MutableList<String> = ArrayList()


    override fun getItemCount(): Int {
        return mFragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return mFragmentList[position]
    }

    fun getTabTitle(position: Int): String {
        return mFragmentTitleList[position]
    }

    fun addFragment(fragment: Fragment, title: String) {
       mFragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }
}