package com.nitinnegi.kotlin_mvp.presenter

import com.nitinnegi.kotlin_mvp.contract.Contract
import com.nitinnegi.kotlin_mvp.view.adapter.BaseItem
import com.nitinnegi.kotlin_mvp.view.adapter.HeaderBaseItem
import com.nitinnegi.kotlin_mvp.view.adapter.RowBaseItem

class MyPresenter(view : Contract.View) : Contract.Presenter {

    var mView : Contract.View = view
    val animals: ArrayList<String> = ArrayList()
    val animalsDescription: ArrayList<String> = ArrayList()

//    constructor(mView: Contract.View, name: String): this(view, "Nitin"){
//
//    }

    override fun fetchValues() {
        addAnimals()
        addAnimalsDescription()
        val baseItemList = ArrayList<BaseItem>()
        for (animal in animals){
            baseItemList.add(HeaderBaseItem(animal))
            baseItemList.add(RowBaseItem(animal))
        }

        mView.updateAdapterInformation(baseItemList)
    }

    private fun addAnimals() {

        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
        animals.add("cheetah")
        animals.add("raccoon")
        animals.add("bird")
        animals.add("snake")
        animals.add("lizard")
        animals.add("hamster")
        animals.add("bear")
        animals.add("lion")
        animals.add("tiger")
        animals.add("horse")
        animals.add("frog")
        animals.add("fish")
        animals.add("shark")
        animals.add("turtle")
        animals.add("elephant")
        animals.add("cow")
        animals.add("beaver")
        animals.add("bison")
        animals.add("porcupine")
        animals.add("rat")
        animals.add("mouse")
        animals.add("goose")
        animals.add("deer")
        animals.add("fox")
        animals.add("moose")
        animals.add("buffalo")
        animals.add("monkey")
        animals.add("penguin")
        animals.add("parrot")

    }

    private fun addAnimalsDescription() {

        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")
        animalsDescription.add("Very Nice")

    }

}