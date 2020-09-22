package com.example.motionlayoutexampleapplication.viewpagerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.viewpager.widget.ViewPager
import com.example.motionlayoutexampleapplication.R
import kotlinx.android.synthetic.main.activity_view_pager_demo.*

class ViewPagerDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager_demo)
        viewPagerAnimation.apply {
            adapter = ViewPagerAdapter()
        }
        val motionLayout = findViewById<MotionLayout>(R.id.motionLayoutViewPager)
        if (motionLayout != null) {
            viewPagerAnimation.addOnPageChangeListener(motionLayout as ViewPager.OnPageChangeListener)
        }
    }
}