package com.example.viewpagerexample

import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = CustomViewPagerAdapter(supportFragmentManager)
        adapter.addItem(FragmentChats(),"Chats")
        adapter.addItem(FragmentStatus(),"Status")
        adapter.addItem(FragmentCalls(),"Calls")

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager!!.adapter = adapter

        val tabs = findViewById<TabLayout>(R.id.tabLayout)
        tabs.setupWithViewPager(viewPager)

//        tabs.addTab(tabs.newTab().setText("Chats"))
//        tabs.addTab(tabs.newTab().setText("Status"))
//        tabs.addTab(tabs.newTab().setText("Calls"))
//        tabs.tabGravity = TabLayout.GRAVITY_FILL
//
//        viewPager!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
//
//        tabs!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
//            override fun onTabSelected(tab: TabLayout.Tab) {
//                //viewPager!!.currentItem = tab.position
//                val view = tab.customView
//                if(view is AppCompatTextView){
//                    println("check this")
//                    view.setTypeface(view.typeface, Typeface.BOLD)
//                    view.textSize = 100.0F
//                }
//            }
//            override fun onTabUnselected(tab: TabLayout.Tab) {
//                val view = tab.customView
//                if(view is AppCompatTextView){
//                    view.setTypeface(view.typeface, Typeface.NORMAL)
//                }
//            }
//            override fun onTabReselected(tab: TabLayout.Tab) {
//            }
//        })

    }
}