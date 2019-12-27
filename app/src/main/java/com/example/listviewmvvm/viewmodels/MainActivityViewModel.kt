package com.example.listviewmvvm.viewmodels

import android.arch.lifecycle.ViewModel
import com.example.listviewmvvm.repositories.PlacesRepository

class MainActivityViewModel: ViewModel() {
    val places by lazy {
        PlacesRepository.getPlacesRepo()
    }
}