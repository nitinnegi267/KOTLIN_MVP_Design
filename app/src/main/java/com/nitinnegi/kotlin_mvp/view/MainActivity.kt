package com.nitinnegi.kotlin_mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nitinnegi.kotlin_mvp.R
import com.nitinnegi.kotlin_mvp.contract.Contract
import com.nitinnegi.kotlin_mvp.presenter.MyPresenter
import com.nitinnegi.kotlin_mvp.view.adapter.BaseItem
import com.nitinnegi.kotlin_mvp.view.adapter.MyAdapter
import java.util.ArrayList

class MainActivity : AppCompatActivity(), Contract.View {

    lateinit var mPresenter: Contract.Presenter
    lateinit var mRecyclerView: RecyclerView
    var mAdapter: MyAdapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter = MyPresenter(this)
        mRecyclerView = findViewById(R.id.recyclerview)
        mRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        mRecyclerView.adapter = mAdapter
        mPresenter.fetchValues()
    }

    override fun updateAdapterInformation(baseItemList: ArrayList<BaseItem>) {
        mAdapter.updateAdapterData(baseItemList)
    }

}
