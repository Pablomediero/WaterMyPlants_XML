package com.example.watermyplants_xml.domain.repository

import com.example.watermyplants_xml.model.Plant

interface PlantRepository {
    suspend fun savePlant(plant: Plant)
}