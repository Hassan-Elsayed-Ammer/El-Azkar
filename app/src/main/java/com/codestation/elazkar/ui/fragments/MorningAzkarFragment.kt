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
import com.google.gson.Gson
import org.json.JSONObject
import java.io.InputStream


class MorningAzkarFragment : Fragment() {

    private lateinit var adapter: ElzkerAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var elzekerList :ArrayList<ElZekr>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // call load json function
        val jsonString = loadJson(requireContext())

        //use Gson to parse json objects to kotlin objects - i have one object from Elazkar Objects
        val azkar = Gson().fromJson(jsonString,ElZekr::class.java)



    }
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
        //val jsonObject = JSONObject()



    }

    /**
     * Write a func to load json from the Azkar_Morning.json - it return string
     */
    private fun loadJson(context: Context): String? {
        var input: InputStream? = null
        var jsonString: String

        try {
            /** 1- Open Azkar file
             * 2- Create InputStream to read data by make buffer
             */
            input = context.assets.open("Azkar_Morning.json")
            val size = input.available()

            // Create a buffer with the size
            val buffer = ByteArray(size)

            // Read data from InputStream into the Buffer
            input.read(buffer)

            // Create a json String
            jsonString = String(buffer)
            return jsonString
        } catch (ex: Exception) {
            ex.printStackTrace()
        } finally {
            // Must close the stream
            input?.close()
        }

        return null
    }

}