package com.jcardenas.exam.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jcardenas.exam.R
import com.jcardenas.exam.core.getImageResource
import com.jcardenas.exam.databinding.AdapterAvailableBooksBinding
import com.jcardenas.exam.domain.model.AvailableBooks

class AvailableBooksAdapter(
    private val list: List<AvailableBooks>,
    private val onClickListener: (AvailableBooks) -> Unit
) : RecyclerView.Adapter<AvailableBooksAdapter.AvailableBooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvailableBooksViewHolder {
        return AvailableBooksViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.adapter_available_books, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AvailableBooksViewHolder, position: Int) {
        holder.setInfo(list[position], onClickListener)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class AvailableBooksViewHolder(
        view: View
    ) : RecyclerView.ViewHolder(view) {

        private val binding = AdapterAvailableBooksBinding.bind(view)

        fun setInfo(info: AvailableBooks, onClickListener: (AvailableBooks) -> Unit) {
            binding.txtTitle.text = info.book

            binding.imIcon.setImageResource(
                getImageResource(info.book)
            )

            binding.clClick.setOnClickListener {
                onClickListener(info)
            }
        }
    }
}