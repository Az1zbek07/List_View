package com.example.newapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import android.widget.ListView
import com.example.newapplication.model.Item
import com.example.newapplication.model.ItemAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private val itemAdapter by lazy { ItemAdapter(this, birXil()) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        listView.adapter = itemAdapter
    }

    private fun xarXil(): MutableList<Item> {
        val list = mutableListOf<Item>()
        list.add(Item("Android", "323.234.132", R.drawable.ic_launcher_background))
        list.add(Item("OOP", "323.2.34", R.drawable.ic_launcher_background))
        list.add(Item("Green", "1.23.3421", R.drawable.ic_launcher_background))
        return list
    }

    private fun birXil(): MutableList<Item> {
        val list = mutableListOf<Item>()
        repeat(50){
            list.add(Item("Android", "3676.23.32", R.drawable.ic_launcher_background))
        }
        return list
    }
}