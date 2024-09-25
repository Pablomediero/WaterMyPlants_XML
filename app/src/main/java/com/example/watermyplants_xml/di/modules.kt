package com.example.watermyplants_xml.di

import com.example.watermyplants_xml.data.local.PlantLocalSource
import com.example.watermyplants_xml.data.local.PlantLocalSourceImpl
import com.example.watermyplants_xml.data.repository.PlantRepositoryImpl
import com.example.watermyplants_xml.domain.repository.PlantRepository
import com.example.watermyplants_xml.domain.usecase.AddPlantUseCase
import com.example.watermyplants_xml.presentation.add_plant.viewmodel.AddPlantViewmodel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val mainModule = module {
    domainModule()
    dataModule()
    presentationModule()
}

private fun Module.domainModule() {
    singleOf(::AddPlantUseCase)
}

private fun Module.dataModule() {
    singleOf(::PlantRepositoryImpl) bind PlantRepository::class
    singleOf(::PlantLocalSourceImpl) bind PlantLocalSource::class
}
private fun Module.presentationModule() {
    viewModelOf(::AddPlantViewmodel)
}