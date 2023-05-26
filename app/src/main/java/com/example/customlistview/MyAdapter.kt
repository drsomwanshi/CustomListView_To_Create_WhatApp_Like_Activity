package com.example.customlistview

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
class MyAdapter(private val context: Activity, private val name: Array<String>, private val contact: Array<String>, private val imgid: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.list_item, name) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_item, null, true)
        val titleText = rowView.findViewById(R.id.txt1) as TextView
        val imageView = rowView.findViewById(R.id.img1) as ImageView
        val subtitleText = rowView.findViewById(R.id.txt2) as TextView
        titleText.text = name[position]
        imageView.setImageResource(imgid[position])
        subtitleText.text = contact[position]
        return rowView
    }
}

