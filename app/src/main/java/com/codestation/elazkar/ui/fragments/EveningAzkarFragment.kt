package com.codestation.elazkar.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.codestation.elazkar.R
import com.codestation.elazkar.databinding.FragmentEveningAzkarBinding

class EveningAzkarFragment : Fragment() {
    private lateinit var binding: FragmentEveningAzkarBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEveningAzkarBinding.inflate(inflater, container, false)
        return binding.root
    }

}