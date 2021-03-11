package com.example.task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SquareNumActivity : AppCompatActivity() {

    val TAG = "SquareNumActivity"
    var squaredNum : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square_num)

        val counter = intent.getIntExtra("counter", 0)
        squaredNum = counter * counter

        val squaredNumView : TextView = findViewById(R.id.squaredNumView)
        squaredNumView.text = squaredNum.toString()
        Log.i(TAG,"created")
    }

    override fun onStart() {
        super.onStart()

        findViewById<TextView>(R.id.squaredNumView).text = squaredNum.toString()
        Log.i(TAG,"started")
    }

    override fun onResume() {
        super.onResume()

        Log.i(TAG,"resumed")
    }

    override fun onPause() {
        Log.i(TAG,"paused")

        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG,"stopped")

        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()

        Log.i(TAG,"restarted")
    }

    override fun onDestroy() {
        Log.i(TAG,"destroyed")

        super.onDestroy()
    }

}