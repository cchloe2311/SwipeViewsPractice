package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.adapter = MyFragmentStateAdapter(this)

        // TabLayourMediator를 이용해 ViewPager2와 TabLayout 연결
       TabLayoutMediator(tabLayout, viewPager) {
            tab, position ->
           // TabConfigurationStrategy 구현 (탭 레이아웃의 탭 아이템들의 스타일과 텍스트를 설정)
            tab.text = "TAB ${(position + 1)}"
        }.attach() // attach() 메소드를 호출해 연결!
    }
}
