package com.codestation.elazkar.ui.fragments.elsabha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.codestation.elazkar.databinding.FragmentElsabhaBinding


class ElsabhaFragment : Fragment() {
    private lateinit var binding: FragmentElsabhaBinding
    private lateinit var viewModel: ElsabhaViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentElsabhaBinding.inflate(inflater, container, false)

        viewModel = ViewModelProvider(this)[ElsabhaViewModel::class.java]

        binding.layIncrease.setOnClickListener {
            viewModel.addNumbersInCounterList()
        }

        viewModel.counterList.observe(viewLifecycleOwner) {
            binding.tvCounter.text = it.toString()
        }

        binding.layIncrease.setOnLongClickListener {
            viewModel.resetCounter()
            return@setOnLongClickListener true
        }
        viewModel.counterList.observe(viewLifecycleOwner) {
            binding.tvCounter.text = it.toString()
        }



        return binding.root
    }


}