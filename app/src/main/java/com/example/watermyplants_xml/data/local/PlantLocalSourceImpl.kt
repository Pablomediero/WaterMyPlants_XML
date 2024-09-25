package com.example.watermyplants_xml.data.local

import android.util.Log
import com.example.watermyplants_xml.model.Plant

class PlantLocalSourceImpl(): PlantLocalSource{
    override suspend fun savePlant(plant: Plant) {
        Log.d("Result", "Plant was added in bbdd. ${plant.namePlant} - ${plant.waterDayPlant}")
    }
}