package com.codestation.elazkar.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codestation.elazkar.R
import com.codestation.elazkar.adapters.ElzkerAdapter
import com.codestation.elazkar.data.ElZekr
import org.json.JSONObject


class MorningAzkarFragment : Fragment() {

    private lateinit var adapter: ElzkerAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var elzekerList :ArrayList<ElZekr>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_morning_azkar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView  = view.findViewById(R.id.recycler_morning)
        adapter = ElzkerAdapter()
        recyclerView.adapter = adapter
        val jsonObject = JSONObject()


    }

}