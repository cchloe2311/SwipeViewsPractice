package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        viewPager.adapter = DemoCollectionAdapter(this)
//        TabLayoutMediator(tabLayout, viewPager) {
//            tab, position ->
//            tab.text = "OBJECT ${(position + 1)}"
//        }

    }
}
