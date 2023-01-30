package com.codestation.elazkar.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codestation.elazkar.data.ElZekr
import com.codestation.elazkar.databinding.ElzekrItemBinding

class ElzkerAdapter(
    val items: List<ElZekr>
) : RecyclerView.Adapter<ElzkerAdapter.ElzekrViewHolder>() {

    inner class ElzekrViewHolder(val binding: ElzekrItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElzekrViewHolder {
        val binding = ElzekrItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ElzekrViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ElzekrViewHolder, position: Int) {
        val elzekr = items[position]
        holder.binding.tvId.text = elzekr.id.toString()
        holder.binding.tvElzekr.text = elzekr.alzekr
        holder.binding.tvNumberOfRepetition.text = elzekr.numberOfRepetition
    }

    override fun getItemCount() = items.size
}