package com.example.listviewmvvm

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.listviewmvvm.adapters.RecyclerViewAdapter
import com.example.listviewmvvm.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    lateinit var mainActivityViewModel: MainActivityViewModel
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        mainActivityViewModel = ViewModelProviders.of(this)[MainActivityViewModel::class.java]
        initRecyclerView()
    }

    private fun initRecyclerView() {
        adapter = RecyclerViewAdapter(this, mainActivityViewModel.places)
        val linearLayout = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayout
        recyclerView.adapter = adapter
    }
}