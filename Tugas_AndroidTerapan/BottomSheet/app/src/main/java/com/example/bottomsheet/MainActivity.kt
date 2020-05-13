package com.example.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    var mBottomSheetDialog: BottomSheetDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun showBottom(view: View){
        val bottomSheetLayout:View = layoutInflater.inflate(R.layout.bottom_sheet, null)
        mBottomSheetDialog = BottomSheetDialog(this)
        mBottomSheetDialog!!.setContentView(bottomSheetLayout)
        mBottomSheetDialog!!.show()
    }
}
