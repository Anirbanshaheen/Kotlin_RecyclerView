package com.example.kotlinrecyclerview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item.view.*

class ExampleAdapter(private val context: Context, private val exampleItem: List<ExampleItem>)
    : RecyclerView.Adapter<ExampleAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.example_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val example = exampleItem[position]
        holder.bind(example)
    }

    override fun getItemCount() = exampleItem.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("SetTextI18n")
        fun bind(example: ExampleItem) {
            itemView.text_name.text = example.name
            itemView.text_age.text = "Age: ${example.age}"
        }
    }
}

//    (private val exampleList: List<ExampleItem>) : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {
//
//    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//
//        val imageView: ImageView = itemView.imageView
//        val textView1: TextView = itemView.text_1
//        val textView2: TextView = itemView.text_2
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
//        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.example_item,parent,false)
//        return ExampleViewHolder(itemView)
//    }
//
//    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
//        val currentItem = exampleList[position]
//
//        holder.imageView.setImageResource(currentItem.imageResource)
//        holder.textView1.text = currentItem.text1
//        holder.textView2.text = currentItem.text2
//    }
//
//    override fun getItemCount() = exampleList.size
//}