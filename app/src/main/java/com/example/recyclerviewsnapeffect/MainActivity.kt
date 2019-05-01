package com.example.recyclerviewsnapeffect

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.*
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    private lateinit var rvSnap: RecyclerView
    private lateinit var mAdapter:ImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvSnap = findViewById(R.id.rv_snap)
        mAdapter = ImageAdapter(this)
        initView()
    }

    private fun initView() {
        val linearLayoutManager:LinearLayoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
        rvSnap.layoutManager = linearLayoutManager
        val snapHelper:SnapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(rvSnap)
        rvSnap.adapter = mAdapter
    }

    private fun initViewLinearSnapHelper() {
        val linearLayoutManager:LinearLayoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
        rvSnap.layoutManager = linearLayoutManager
        val snapHelper:SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(rvSnap)
        rvSnap.adapter = mAdapter
    }
}
