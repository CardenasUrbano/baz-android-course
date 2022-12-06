package com.jcardenas.exam.presentation.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.jcardenas.exam.R
import com.jcardenas.exam.databinding.FragmentCryptoListBinding
import com.jcardenas.exam.domain.model.AvailableBooks
import com.jcardenas.exam.presentation.adapter.AvailableBooksAdapter
import com.jcardenas.exam.presentation.viewmodel.CryptoViewModel

class CryptoListFragment : Fragment() {

    private lateinit var binding: FragmentCryptoListBinding
    private val cryptoViewModel: CryptoViewModel by activityViewModels()

    private var availableBooksAdapter: AvailableBooksAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCryptoListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cryptoViewModel.getAvailableBooks()

        cryptoViewModel.availableBooks.observe(viewLifecycleOwner) { list ->
            availableBooksAdapter = AvailableBooksAdapter(list) { book ->
                onItemSelected(book)
            }
            binding.rvAvailableBooks.layoutManager = LinearLayoutManager(requireContext())
            binding.rvAvailableBooks.adapter = availableBooksAdapter
        }

        cryptoViewModel.isLoading.observe(viewLifecycleOwner) {
            binding.pbMain.isVisible = it
        }
    }

    private fun onItemSelected(book: AvailableBooks) {
        cryptoViewModel.saveBook(book)
        findNavController().navigate(R.id.action_cryptoListFragment_to_cryptoDetailFragment)
    }
}