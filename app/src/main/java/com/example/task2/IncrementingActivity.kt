package com.example.task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class IncrementingActivity : AppCompatActivity() {

    var counter = 0
    val TAG = "IncrementingActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_incrementing)

        val counterView : TextView = findViewById(R.id.counterView)
        counterView.text = counter.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt("counter", counter)
        Log.i(TAG,"state saved")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        counter = savedInstanceState.getInt("counter") + 1;
        findViewById<TextView>(R.id.counterView).text = counter.toString()

        Log.i(TAG,"state restored")
    }

    override fun onStart() {
        super.onStart()

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

    fun onRunSquareActivityBtnClick(view: View) {
        val sendIntent = Intent(
            this,
            SquareNumActivity::class.java
        ).apply {
            putExtra("counter", counter)
        }
        startActivity(sendIntent)
    }

}