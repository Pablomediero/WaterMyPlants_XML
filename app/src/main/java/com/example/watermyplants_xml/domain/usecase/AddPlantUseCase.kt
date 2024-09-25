package com.example.watermyplants_xml.domain.usecase

import com.example.watermyplants_xml.domain.repository.PlantRepository
import com.example.watermyplants_xml.model.Plant

class AddPlantUseCase(
    private val plantRepository: PlantRepository
) {
     suspend operator fun invoke(plant: Plant) = plantRepository.savePlant(plant)
}