package com.xiong.jitpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.xiong.utils.commons.HiDisplayUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("MainActivity", "HiDisplayUtil.dp2px(20f): " + HiDisplayUtil.dp2px(20f))
    }
}