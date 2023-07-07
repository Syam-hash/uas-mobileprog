package com.example.ahmadsyam

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity :AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                        btn_menu.setOnClickListener{
                                startActivity(Intent(this,Main2Activity::class.java))
                                val text = "Pilih menu sesuai dengan kebutuhan anda"
                                val duration = Toast.LENGTH_SHORT

                                val toast = Toast.makeText(applicationContext, text, duration)
                                toast.show()

                        }}

                override fun onBackPressed() {
                        // Create the object of AlertDialog Builder class
                        val builder = AlertDialog.Builder(this)

                        // Set the message show for the Alert time
                        builder.setMessage("Apakah anda ingin keluar dari aplikasi ini ?")

                        // Set Alert Title
                        builder.setTitle("Peringatan !")

                        // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
                        builder.setCancelable(false)

                        // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                        builder.setPositiveButton("Yes") {
                                // When the user click yes button then app will close
                                        dialog, which -> finish()
                        }

                        // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
                        builder.setNegativeButton("No") {
                                // If user click no then dialog box is canceled.
                                        dialog, which -> dialog.cancel()
                        }

                        // Create the Alert dialog
                        val alertDialog = builder.create()
                        // Show the Alert Dialog box
                        alertDialog.show()
                }


}