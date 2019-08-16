package com.nitinnegi.kotlin_mvp.view.adapter

class HeaderBaseItem(animal: String) : BaseItem() {

    var header: String = animal

    override fun getBaseItem(): Int {
        return HEADER
    }
}