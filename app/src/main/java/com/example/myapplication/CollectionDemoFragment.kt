//package com.example.myapplication
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import androidx.viewpager2.widget.ViewPager2
//import kotlinx.android.synthetic.main.activity_main.view.*
//
//class CollectionDemoFragment : Fragment() {
//    private lateinit var demoCollectionAdapter: DemoCollectionAdapter
//    private lateinit var viewPager: ViewPager2
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.activity_main, container, false)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        demoCollectionAdapter = DemoCollectionAdapter(this)
//        viewPager = view.viewPager
//        viewPager.adapter = demoCollectionAdapter
//    }
//}