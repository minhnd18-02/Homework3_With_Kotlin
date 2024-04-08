package com.example.homework3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class CustomAdapter(context: Context, items: ArrayList<String>) :
    ArrayAdapter<String>(context, 0, items) {

    private val mContext: Context = context
    private val mItems: ArrayList<String> = items

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(mContext).inflate(R.layout.custom_row_layout, parent, false)
        }

        val currentItem = mItems[position]

        val itemNameTextView = listItemView!!.findViewById<TextView>(R.id.item_name)
        itemNameTextView.text = currentItem

        return listItemView
    }
}