package com.nitinnegi.kotlin_mvp.view.adapter

abstract class BaseItem {

    companion object {
        val HEADER = 0
        internal val ROW = 1
    }

    abstract fun getBaseItem() : Int
}