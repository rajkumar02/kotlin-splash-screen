package com.splashscreen.rkb

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val durations = 2000
            Handler(Looper.myLooper()!!).postDelayed({
            val nextActivity = Intent(this@SplashScreen, MainActivity::class.java)
            this@SplashScreen.startActivity(nextActivity)
            finish()
        }, durations.toLong())
    }
}