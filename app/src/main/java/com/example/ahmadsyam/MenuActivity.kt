package com.example.ahmadsyam

import android.content.Intent
import android.os.Bundle


import androidx.appcompat.app.AppCompatActivity

import com.example.ahmadsyam.useCase.cameraIntent.SimpleCameraActivity
import com.example.ahmadsyam.useCase.cameraX.CameraXActivity
import com.example.ahmadsyam.useCase.detectFromPicture.DetectFromPictureActivity
import com.example.ahmadsyam.useCase.detectText.DetectTextActivity


import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity :AppCompatActivity(){

        override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btn_camera_intent.setOnClickListener{
        startActivity(Intent(this,SimpleCameraActivity::class.java))
        }

        btn_camera_x.setOnClickListener{
        startActivity(Intent(this,CameraXActivity::class.java))
        }

        btn_camera_x_detectText.setOnClickListener{
        startActivity(Intent(this,DetectTextActivity::class.java))
        }

        btn_detect.setOnClickListener {
        startActivity(Intent(this, DetectFromPictureActivity::class.java))
        }
        }



        }