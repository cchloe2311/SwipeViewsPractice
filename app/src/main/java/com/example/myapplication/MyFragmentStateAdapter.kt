package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * FragmentStateAdapter
 * : RecyclerView.Adapter의 하위클래스
 * 인자 값으로 Fragment를 전달해 Fragment를 하나의 view처럼 사용하는 RecyclerView 느낌!
 *
 * 프래그먼트의 각 화면을 관리 (프래그먼트의 상태를 저장 등)
 * 보이는 화면 외에는 그 상태만 저장해 훨씬 적은 메모리를 사용하도록 함
 *
 * ViewPager2 내에서 Fragment를 전환할 화면으로 사용하는 경우, FragmentStateAdapter를 상속받은 어답터 사용 필요
 * ViewPager2가 액티비티 내에서 동작하기 때문에 FragmentActivity 전달
 */
class MyFragmentStateAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    //override fun getItemCount(): Int = 100 // 100번까지 슬라이딩 가능 마치 무한한 슬라이딩처럼!
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        // Return a NEW fragment instance in createFragment(int)
        val fragment = MyFragment()
        fragment.arguments = Bundle().apply {
            putInt(FRAGMENT_POSITION_KEY, position + 1)
            putBoolean(IS_SHOW_KEY, position == 0)
        }
        return fragment
    }
}