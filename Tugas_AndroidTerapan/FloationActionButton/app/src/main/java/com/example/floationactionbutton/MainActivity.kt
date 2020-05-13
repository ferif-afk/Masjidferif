package com.example.floationactionbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View){
        showSnack()
    }

    fun showSnack(){
//        val activityView: View = findViewById(R.id.activity_main)
//        snack = Snackbar.make(activityView, "This is my snakbar test", Snackbar.LENGTH_SHORT)
//        snack.setAction("Dismis")
//        {
//            snack.dismis()
//        }
//        snackBarLayout.setBackgroundColor(resources.getColor(R.color.colorAccent))
//        val sntextview = snackbarLayout.findViewById(android)
//        snack.show()
    }
}
