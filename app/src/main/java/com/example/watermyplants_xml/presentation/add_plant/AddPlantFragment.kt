package com.example.watermyplants_xml.presentation.add_plant

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.watermyplants_xml.R
import com.example.watermyplants_xml.databinding.FragmentAddPlantBinding


class AddPlantFragment : Fragment() {
    private val binding: FragmentAddPlantBinding by lazy {
        FragmentAddPlantBinding.inflate(layoutInflater)
    }

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val daysOfWeek = resources.getStringArray(R.array.days_of_week)
        val arrayAdapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_dropdown_item_1line,
            daysOfWeek
        )
        binding.autoCompleteDays.setAdapter(arrayAdapter)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return binding.root
    }


}