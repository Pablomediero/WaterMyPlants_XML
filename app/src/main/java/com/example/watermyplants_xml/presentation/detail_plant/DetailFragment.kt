package com.example.watermyplants_xml.presentation.detail_plant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.watermyplants_xml.R
import com.example.watermyplants_xml.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
    private val binding: FragmentDetailBinding by lazy {
        FragmentDetailBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        initListeners()
        return binding.root
    }

    private fun initListeners() {
        binding.btBack.setOnClickListener {
            findNavController().navigate(R.id.homeFragment)
        }
    }
}