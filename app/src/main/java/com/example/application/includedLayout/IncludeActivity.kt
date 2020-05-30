package com.example.application.includedLayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.application.R
import com.example.application.databinding.ActivityIncludeBinding

class IncludeActivity : AppCompatActivity() {

    private lateinit var includeBinding: ActivityIncludeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_include)
        //returns the binding of the activity and view passed
        includeBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_include
        )
        //getter setter for binder
        includeBinding.teacher = getTeacher()
    }

    private fun getTeacher(): Teacher {
        return Teacher(
            "Arpit",
            "arpitJain@gmail.com"
        )
    }

}
