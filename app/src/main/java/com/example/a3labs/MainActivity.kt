package com.example.a3labs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import android.view.WindowManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnChecker1(view: android.view.View) {
        supportFragmentManager.commit {
            replace<FirstFragment>(R.id.fragmentContainerView)
        }
    }
        fun btnChecker2(view: android.view.View) {
            supportFragmentManager.commit {
                replace<SecondFragment>(R.id.fragmentContainerView)
            }
            window.setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE)
    }
}
