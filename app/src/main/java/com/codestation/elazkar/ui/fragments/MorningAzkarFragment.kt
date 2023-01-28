package com.codestation.elazkar.ui.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codestation.elazkar.R
import com.codestation.elazkar.adapters.ElzkerAdapter
import com.codestation.elazkar.data.ElZekr
import com.codestation.elazkar.databinding.FragmentMorningAzkarBinding
import com.google.gson.Gson
import org.json.JSONObject
import java.io.InputStream


class MorningAzkarFragment : Fragment() {

    private lateinit var binding: FragmentMorningAzkarBinding

    private lateinit var adapter: ElzkerAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var elzekerList: ArrayList<ElZekr>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMorningAzkarBinding.inflate(inflater, container, false)
        return binding.root
    }


//    /**
//     * Write a func to load json from the Azkar_Morning.json - it return string
//     */
//    private fun loadJson(context: Context): String? {
//        var input: InputStream? = null
//        var jsonString: String
//
//        try {
//            /** 1- Open Azkar file
//             * 2- Create InputStream to read data by make buffer
//             */
//            input = context.assets.open("Azkar_Morning.json")
//            val size = input.available()
//
//            // Create a buffer with the size
//            val buffer = ByteArray(size)
//
//            // Read data from InputStream into the Buffer
//            input.read(buffer)
//
//            // Create a json String
//            jsonString = String(buffer)
//            return jsonString
//        } catch (ex: Exception) {
//            ex.printStackTrace()
//        } finally {
//            // Must close the stream
//            input?.close()
//        }
//
//        return null
//    }

}