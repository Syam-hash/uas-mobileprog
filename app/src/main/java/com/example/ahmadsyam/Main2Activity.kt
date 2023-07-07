package com.example.ahmadsyam

import android.content.Intent
import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn_menu_camera.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            val text = "Pilih menu Kamera sesuai dengan kebutuhan anda"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()

        }
        btn_menu_input.setOnClickListener {
            startActivity(Intent(this, inputActivity::class.java))
            val text = "Pilih menu sesuai dengan kebutuhan anda"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()

        }
    }
}