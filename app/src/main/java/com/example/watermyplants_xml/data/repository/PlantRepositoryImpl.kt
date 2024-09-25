package com.example.watermyplants_xml.data.repository

import android.util.Log
import com.example.watermyplants_xml.data.local.PlantLocalSource
import com.example.watermyplants_xml.domain.repository.PlantRepository
import com.example.watermyplants_xml.model.Plant

class PlantRepositoryImpl(
    private val plantLocalSource: PlantLocalSource
): PlantRepository {
    override suspend fun savePlant(plant: Plant) = plantLocalSource.savePlant(plant)

}