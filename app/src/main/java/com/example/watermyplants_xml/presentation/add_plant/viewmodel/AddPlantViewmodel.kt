package com.example.watermyplants_xml.presentation.add_plant.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.watermyplants_xml.domain.usecase.AddPlantUseCase
import com.example.watermyplants_xml.model.Plant
import kotlinx.coroutines.launch

class AddPlantViewmodel(
    private val addPlantUseCase: AddPlantUseCase
): ViewModel(){

     fun addPlant(plant: Plant){
         viewModelScope.launch {
             addPlantUseCase(plant)
         }
    }
}