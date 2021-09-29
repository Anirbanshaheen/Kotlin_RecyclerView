package com.example.kotlinrecyclerview

import android.graphics.Color
import android.icu.text.RelativeDateTimeFormatter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleItem = exampleItem()
        recyclerView.adapter = ExampleAdapter(this,exampleItem)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun exampleItem(): List<ExampleItem> {
        val items = mutableListOf<ExampleItem>()
        for (i in 1..150){
            items.add(ExampleItem("Title $i", i))
        }
        return items
    }
}