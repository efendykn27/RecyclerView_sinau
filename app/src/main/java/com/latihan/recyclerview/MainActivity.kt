package com.latihan.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext,2)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        dataList.add(DataModel("Title", "Desc", R.drawable.adela))
        dataList.add(DataModel("Title", "Desc", R.drawable.pku))
        dataList.add(DataModel("Title", "Desc", R.drawable.mitra))
        dataList.add(DataModel("Title", "Desc", R.drawable.palaraya))
        dataList.add(DataModel("Title", "Desc", R.drawable.harse))
        dataList.add(DataModel("Title", "Desc", R.drawable.palaraya))
        dataList.add(DataModel("Title", "Desc", R.drawable.adela))
        dataList.add(DataModel("Title", "Desc", R.drawable.pku))

        photoAdapter.setDataList(dataList)


    }
}