package com.example.listviewmvvm.repositories

import com.example.listviewmvvm.models.Place

object PlacesRepository {
    lateinit var places: ArrayList<Place>

    fun getPlacesRepo(): ArrayList<Place> {
        setPlaces()
        return places
    }

    fun setPlaces() {
        places = ArrayList()
        places.add(Place("TEST", "TEST"))
        places.add(Place("TEST", "TEST"))
        places.add(Place("TEST", "TEST"))
        places.add(Place("TEST", "TEST"))
        places.add(Place("TEST", "TEST"))
        places.add(Place("TEST", "TEST"))
        places.add(Place("TEST", "TEST"))
        places.add(Place("TEST", "TEST"))
        places.add(Place("TEST", "TEST"))
        places.add(Place("TEST", "TEST"))
        places.add(Place("TEST", "TEST"))
    }
}