package com.codestation.elazkar.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.codestation.elazkar.R
import com.codestation.elazkar.data.ElZekr

class ElzkerAdapter() : RecyclerView.Adapter<ElzkerAdapter.ElzekrViewHolder>() {

    inner class ElzekrViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvId: TextView
        var tvElzekr: TextView
        var tvNumberOfRepetition: TextView

        init {
            tvId = itemView.findViewById(R.id.tv_id)
            tvElzekr = itemView.findViewById(R.id.tv_elzekr)
            tvNumberOfRepetition = itemView.findViewById(R.id.tv_numberOfRepetition)
        }
    }


    private val differCallback = object : DiffUtil.ItemCallback<ElZekr>() {
        override fun areItemsTheSame(oldItem: ElZekr, newItem: ElZekr): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ElZekr, newItem: ElZekr): Boolean {
            return oldItem == newItem
        }

    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElzekrViewHolder {

        return ElzekrViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.elzekr_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ElzekrViewHolder, position: Int) {
       val elzekr = differ.currentList[position]

        holder.tvId.text = elzekr.id.toString()
        holder.tvElzekr.text = elzekr.alzekr
        holder.tvNumberOfRepetition.text = elzekr.numberOfRepetition

    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}