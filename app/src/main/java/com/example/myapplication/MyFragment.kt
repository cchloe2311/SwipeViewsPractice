package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_my.view.*

class MyFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_my, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(FRAGMENT_POSITION_KEY) }?.apply {
            view.tv_viewId.text = getInt(FRAGMENT_POSITION_KEY).toString()
        }
        arguments?.takeIf { it.containsKey(IS_SHOW_KEY) }?.apply {
            view.tv_hide_and_show.visibility = if (getBoolean(IS_SHOW_KEY)) View.VISIBLE else View.GONE
        }
    }
}