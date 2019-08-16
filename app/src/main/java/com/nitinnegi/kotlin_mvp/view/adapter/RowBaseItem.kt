package com.nitinnegi.kotlin_mvp.view.adapter

class RowBaseItem(description: String) : BaseItem() {

    var row: String = description

    override fun getBaseItem(): Int {
        return ROW
    }
}