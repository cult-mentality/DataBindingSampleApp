package com.example.application.basic

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.application.R
import com.example.application.databinding.ActivityMainBinding
import com.example.application.includedLayout.IncludeActivity
import com.example.application.two.way.TwoWayActivity

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var activityHandlers: MainActivityHandlers
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //returns the binding of the activity and view passed
        activityMainBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )

        //getter setter for the binder
        activityMainBinding.student = getStudent()

        //initialize the onclick listener class
        activityHandlers = MainActivityHandlers(this)

        //we havent binded our binder with the new class
        //getter and setter provided by binder from the XML layout to bind this class
        activityMainBinding.mainActivityHandlers = activityHandlers
    }

    private fun getStudent(): Student {
        return Student(
            "swanand",
            "kavitkarswanand5@gmail.com"
        )
    }

    inner class MainActivityHandlers(var context: Context) {

        //view is passed by the default method of android onClick
        fun onClickIncluded(view: View) {
            Toast.makeText(
                context,
                "Include Button clicked ${(view as Button).text}",
                Toast.LENGTH_SHORT
            ).show()
            val intent = Intent(context, IncludeActivity::class.java)
            startActivity(intent)
        }

        fun onClickTwoWay(view: View) {
            Toast.makeText(
                context,
                "Two Way Button clicked ${(view as Button).text}",
                Toast.LENGTH_SHORT
            ).show()
            val intent = Intent(context, TwoWayActivity::class.java)
            startActivity(intent)
        }
    }
}
