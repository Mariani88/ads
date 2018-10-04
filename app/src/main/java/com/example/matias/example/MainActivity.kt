package com.example.matias.example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713")
    }
}
