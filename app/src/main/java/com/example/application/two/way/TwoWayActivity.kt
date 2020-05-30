package com.example.application.two.way

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.application.R
import com.example.application.databinding.ActivityTwoWayBinding

class TwoWayActivity : AppCompatActivity() {

    //for two way data binding this class remains as it is
    private lateinit var twoWayBinding: ActivityTwoWayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_include)
        //returns the binding of the activity and view passed
        twoWayBinding = DataBindingUtil.setContentView(this, R.layout.activity_two_way)
        twoWayBinding.contact = getContact()
    }

    private fun getContact(): Contact {
        return Contact(
            "Rahul",
            "rahulKanojia@gmail.com"
        )
    }

}
