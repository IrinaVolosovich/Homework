package com.irina.myapplication3

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Никогда не мойте руки,\n Шею, уши и лицо")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Это глупое занятье\n Не приводит ни к чему.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Вновь испачкаются руки,\n Шея, уши и лицо,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Так зачем же тратить силы,\n Время попусту терять. ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Стричься тоже бесполезно,\n Никакого смысла нет.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "К старости сама собою\n Облысеет голова.")
    }
}