package com.codestation.elazkar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider



class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var tvCounter: TextView
    private lateinit var btnCounter: Button
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        initializeViews()


        btnCounter.setOnClickListener {
            viewModel.addNumbersInCounterList()
        }

        viewModel.counterList.observe(this) {
            //update the ui
            tvCounter.text = it.toString()
        }
    }

//    /**
//     * function to increase counter  */
//    private fun increase() {
//        counter++
//        tvCounter.text = counter.toString()
//        btnCounter.text = counter.toString()
//    }
//
    private fun initializeViews(){
        tvCounter = findViewById(R.id.tv_counter)
        btnCounter = findViewById(R.id.btn_incres)
    }


}