package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * FragmentStateAdapter
 * : RecyclerView.Adapter의 하위클래스
 * 인자 값으로 Fragment를 전달해 Fragment를 하나의 view처럼 사용하는 RecyclerView 느낌!
 */
class DemoCollectionAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    //override fun getItemCount(): Int = 100 // 100번까지 슬라이딩 가능 마치 무한한 슬라이딩처럼!
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        // Return a NEW fragment instance in createFragment(int)
        val fragment = DemoObjectFragment()
        fragment.arguments = Bundle().apply {
            // Our object is just an integer :-P
            putInt("object", position + 1)
        }
        return fragment
    }

}