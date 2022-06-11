package com.example.homepageslider

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class MyAdapter(var layout:IntArray,var context: Context):PagerAdapter() {
    private lateinit var inflater: LayoutInflater
    override fun getCount(): Int {
        return layout.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
      return view==`object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        inflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v=inflater.inflate(layout[position],container,false)
        container.addView(v)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val v=`object`as View
        container.removeView(v)
    }

}