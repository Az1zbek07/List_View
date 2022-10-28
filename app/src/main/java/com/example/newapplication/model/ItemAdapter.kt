package com.example.newapplication.model

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import com.example.newapplication.R

class ItemAdapter(
    context: Context,
    private val itemList: MutableList<Item>
) : BaseAdapter(){
    private val layoutInflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getCount(): Int {
        return itemList.size
    }

    override fun getItem(position: Int): Item {
        return itemList[position]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(pos: Int, p1: View?, viewGroup: ViewGroup): View {
        val view = layoutInflater.inflate(R.layout.item_layout, viewGroup, false)
        val title = view.findViewById<TextView>(R.id.textTitle)
        val time = view.findViewById<TextView>(R.id.textTime)
        val image = view.findViewById<AppCompatImageView>(R.id.imageView)
        val item = getItem(pos)
        title.text = item.title
        time.text = item.time
        image.setImageResource(item.image)
        return view
    }
}