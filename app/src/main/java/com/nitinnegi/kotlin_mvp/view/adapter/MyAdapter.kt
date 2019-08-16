package com.nitinnegi.kotlin_mvp.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nitinnegi.kotlin_mvp.R
import java.util.ArrayList

class MyAdapter : RecyclerView.Adapter<BaseViewHolder>() {

    private var mBaseItemList: ArrayList<BaseItem> = ArrayList()
    private lateinit var mContext: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {

        mContext = parent.context
        var layoutInflater: LayoutInflater = LayoutInflater.from(mContext)
        var baseViewHolder = BaseViewHolder(parent)

        when (viewType) {
            BaseItem.HEADER -> {
                val headerView: View = layoutInflater.inflate(R.layout.header_view, parent, false)
                baseViewHolder = HeaderViewHolder(headerView)
            }
            BaseItem.ROW -> {
                val rowView: View = layoutInflater.inflate(R.layout.row_view, parent, false)
                baseViewHolder = RowViewHolder(rowView)
            }

        }
        return baseViewHolder
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        val baseItem: BaseItem = mBaseItemList.get(position)

        if (holder is HeaderViewHolder && baseItem is HeaderBaseItem) {
            holder.mHeaderTextView.setText(baseItem.header)
        } else if (holder is RowViewHolder && baseItem is RowBaseItem) {
            holder.mRowTextView.setText(baseItem.row)
        }

    }

    override fun getItemViewType(position: Int): Int {
        if(mBaseItemList.isNotEmpty()){
            var baseItem : BaseItem = mBaseItemList.get(position)
            return baseItem.getBaseItem()

        }
        return super.getItemViewType(position)
    }

    override fun getItemCount(): Int {
        return mBaseItemList.size
    }

    fun updateAdapterData(baseItemList: ArrayList<BaseItem>) {
        mBaseItemList = baseItemList
        notifyDataSetChanged()
    }

}