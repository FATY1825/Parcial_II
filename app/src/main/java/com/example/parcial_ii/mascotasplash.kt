package com.example.parcial_ii

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowInsets
import android.view.WindowManager
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_mascotasplash.*

class mascotasplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mascotasplash)

        val splashanimation = AnimationUtils.loadAnimation(this,R.anim.animation)
        imgvet.startAnimation(splashanimation)
        txtnom.startAnimation(splashanimation)

        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >=Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())

        }
        else{
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        @Suppress("DEPRECATION")
        Handler().postDelayed(
            {

                startActivity(
                    Intent(this@mascotasplash, MainActivity::class.java)

                )
                finish()

            },1000

        )
    }
}