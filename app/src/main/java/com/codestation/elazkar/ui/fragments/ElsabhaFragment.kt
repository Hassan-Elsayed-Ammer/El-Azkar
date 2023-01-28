package com.codestation.elazkar.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.codestation.elazkar.R
import com.codestation.elazkar.databinding.FragmentElsabhaBinding
import com.codestation.elazkar.ui.MainActivityViewModel


class ElsabhaFragment : Fragment() {

    private lateinit var binding: FragmentElsabhaBinding

//    private lateinit var viewModel: MainActivityViewModel
//    private lateinit var tvCounter: TextView
//    private lateinit var btnCounter: Button
//    var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentElsabhaBinding.inflate(inflater, container, false)
        return binding.root
    }

//    viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
//    initializeViews()
//
//
//    btnCounter.setOnClickListener {
//        viewModel.addNumbersInCounterList()
//    }
//
//    viewModel.counterList.observe(this) {
//        //update the ui
//        tvCounter.text = it.toString()
//    }

//    private fun initializeViews(){
//        tvCounter = findViewById(R.id.tv_counter)
//        btnCounter = findViewById(R.id.btn_incres)
//    }


}