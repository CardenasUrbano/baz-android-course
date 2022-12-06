package com.jcardenas.exam.presentation.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import com.jcardenas.exam.R
import com.jcardenas.exam.core.formatToMoney
import com.jcardenas.exam.core.getImageResource
import com.jcardenas.exam.databinding.FragmentCryptoDetailBinding
import com.jcardenas.exam.presentation.viewmodel.CryptoViewModel

class CryptoDetailFragment : Fragment() {

    private lateinit var binding: FragmentCryptoDetailBinding
    private val cryptoViewModel: CryptoViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCryptoDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cryptoViewModel.getBookDetail()

        cryptoViewModel.bookSelectedDetail.observe(viewLifecycleOwner) {
            binding.imIcon.setImageResource(getImageResource(it.book))

            binding.txtName.text = it.book
            binding.txtVolume.text = "${it.volume}"
            binding.txtHigh.text = it.high.formatToMoney()
            binding.txtLow.text = it.low.formatToMoney()
        }

        cryptoViewModel.isLoading.observe(viewLifecycleOwner) {
            binding.pbMain.isVisible = it
        }
    }

}