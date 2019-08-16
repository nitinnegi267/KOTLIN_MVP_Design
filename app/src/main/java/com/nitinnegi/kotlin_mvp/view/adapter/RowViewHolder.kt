package com.nitinnegi.kotlin_mvp.view.adapter

import android.view.View
import android.widget.TextView
import com.nitinnegi.kotlin_mvp.R

class RowViewHolder (itemView : View): BaseViewHolder(itemView){

     var mRowTextView: TextView = itemView.findViewById(R.id.row_textview)

}