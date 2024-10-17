package edu.uw.ischool.hyoon719.activityspy

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ActivityManager", "onCreate event fired")
        if (savedInstanceState != null)
            Log.i("ActivityManager", "" + savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("ActivityManager", "onDestroy event fired")
        Log.e("ActivityManager", "We're going down, Captain!")
    }
    override fun onStart() {
        super.onStart()
        Log.i("ActivityManager", "onStart event fired")
    }
    override fun onStop() {
        super.onStop()
        Log.i("ActivityManager", "onStop event fired")
    }
    override fun onPause() {
        super.onPause()
        Log.i("ActivityManager", "onPause event fired")
    }
    override fun onResume() {
        super.onResume()
        Log.i("ActivityManager", "onResume event fired")
    }
}