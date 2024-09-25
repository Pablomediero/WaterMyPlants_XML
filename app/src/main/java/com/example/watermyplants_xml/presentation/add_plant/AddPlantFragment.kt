package com.example.watermyplants_xml.presentation.add_plant

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.watermyplants_xml.R
import com.example.watermyplants_xml.databinding.FragmentAddPlantBinding
import com.example.watermyplants_xml.model.Plant
import com.example.watermyplants_xml.presentation.add_plant.viewmodel.AddPlantViewmodel
import org.koin.androidx.viewmodel.ext.android.activityViewModel


class AddPlantFragment : Fragment() {
    private val binding: FragmentAddPlantBinding by lazy {
        FragmentAddPlantBinding.inflate(layoutInflater)
    }
    private val addPlantViewmodel: AddPlantViewmodel by activityViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()
        initListeners()
    }

    private fun initListeners() {
        binding.btBack.setOnClickListener{
            findNavController().navigate(R.id.homeFragment)
        }

        binding.btCreatePlant.setOnClickListener {
            val namePlant = binding.tiNamePlant.editText?.text.toString()
            val waterDayPlant = binding.tiDaysOfWeekPlant.editText?.text.toString()
            val newPlant = Plant(namePlant, waterDayPlant)
            addPlantViewmodel.addPlant(newPlant)
        }
    }
    private fun initUI(){
        val daysOfWeek = resources.getStringArray(R.array.days_of_week)
        val arrayAdapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_dropdown_item_1line,
            daysOfWeek
        )
        binding.autoCompleteDays.setAdapter(arrayAdapter)
    }

}