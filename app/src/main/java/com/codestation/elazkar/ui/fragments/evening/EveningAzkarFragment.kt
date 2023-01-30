package com.codestation.elazkar.ui.fragments.evening

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.codestation.elazkar.R
import com.codestation.elazkar.adapters.ElzkerAdapter
import com.codestation.elazkar.databinding.FragmentEveningAzkarBinding

class EveningAzkarFragment : Fragment() {

    private lateinit var binding: FragmentEveningAzkarBinding
    private lateinit var viewModel: EveningAzkarViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEveningAzkarBinding.inflate(inflater, container, false)

        viewModel = ViewModelProvider(this)[EveningAzkarViewModel::class.java]

        viewModel.azkarEveningList.observe(viewLifecycleOwner) {
            // set the adapter
            val adapter = ElzkerAdapter(it)
            //update the recycler view
            binding.recyclerEvening.adapter = adapter
        }
        return binding.root
    }

}