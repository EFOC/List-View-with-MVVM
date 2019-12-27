package com.example.listviewmvvm.viewmodels

import android.arch.lifecycle.ViewModel
import android.widget.Toast
import com.example.listviewmvvm.adapters.RecyclerViewAdapter
import com.example.listviewmvvm.models.Place
import com.example.listviewmvvm.repositories.PlacesRepository

class MainActivityViewModel: ViewModel() {
    val places by lazy {
        PlacesRepository.getPlacesRepo()
    }
}