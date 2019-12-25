package com.example.listviewmvvm.repositories

class PlacesRepository {
    companion object {
        var instance = PlacesRepository
    }
    fun getInstance(): PlacesRepository.Companion {
        if(instance == null) {
            instance = PlacesRepository
        }
        return instance
    }
}