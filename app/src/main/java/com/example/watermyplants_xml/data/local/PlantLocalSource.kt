package com.example.watermyplants_xml.data.local

import com.example.watermyplants_xml.model.Plant

interface PlantLocalSource {
    suspend fun savePlant(plant: Plant)
}