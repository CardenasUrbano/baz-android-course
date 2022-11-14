package com.jcardenas.exam.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jcardenas.exam.R
import com.jcardenas.exam.domain.model.AvailableBooks

class AvailableBooksAdapter(
    private val list: List<AvailableBooks>,
    private val mContext: Context
) : RecyclerView.Adapter<AvailableBooksAdapter.AvailableBBooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvailableBBooksViewHolder {
        return AvailableBBooksViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.adapter_available_books, parent, false), mContext
        )
    }

    override fun onBindViewHolder(holder: AvailableBBooksViewHolder, position: Int) {
        holder.setInfo(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class AvailableBBooksViewHolder(
        view: View,
        val mContext: Context
    ) : RecyclerView.ViewHolder(view) {

        private val txtTitle : TextView = itemView.findViewById(R.id.txt_title)

        fun setInfo(info: AvailableBooks){
            txtTitle.text = info.book
        }
    }
}