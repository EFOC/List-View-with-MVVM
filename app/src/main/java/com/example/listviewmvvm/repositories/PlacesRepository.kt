package com.example.listviewmvvm.repositories

import com.example.listviewmvvm.R
import com.example.listviewmvvm.models.Place

object PlacesRepository {
    lateinit var places: ArrayList<Place>

    fun getPlacesRepo(): ArrayList<Place> {
        setPlaces()
        return places
    }

    private fun setPlaces() {
        places = ArrayList()
        places.add(Place("Toronto", R.drawable.cn_tower))
        places.add(Place("Tokyo", R.drawable.tokyo_skytree))
        places.add(Place("Zhongyuan", R.drawable.zhongyuan_tower))
        places.add(Place("Paris", R.drawable.eiffel_tower))
        places.add(Place("Milad", R.drawable.milad_tower))
    }
}