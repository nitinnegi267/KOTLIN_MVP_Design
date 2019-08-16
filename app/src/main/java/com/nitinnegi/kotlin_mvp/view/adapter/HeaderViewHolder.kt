package com.nitinnegi.kotlin_mvp.view.adapter

import android.view.View
import android.widget.TextView
import com.nitinnegi.kotlin_mvp.R

class HeaderViewHolder(itemView : View) : BaseViewHolder(itemView){

  var mHeaderTextView: TextView = itemView.findViewById(R.id.header_textview)

}