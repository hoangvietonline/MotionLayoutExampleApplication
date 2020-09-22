package com.example.motionlayoutexampleapplication.viewpagerdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.example.motionlayoutexampleapplication.R

class ViewPagerAdapter : PagerAdapter() {
    private val listItem = mutableListOf("Hoàng Việt", "Khánh Nguyên", "Nhật Minh", "Đình Tài")
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return listItem.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(container.context)
            .inflate(R.layout.item_view_pager, container, false)
        val textView = view.findViewById<TextView>(R.id.tvName)
        textView.text = listItem[position]
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return listItem[position]
    }
}