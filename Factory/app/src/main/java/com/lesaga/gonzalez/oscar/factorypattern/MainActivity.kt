package com.lesaga.gonzalez.oscar.factorypattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lesaga.gonzalez.oscar.factorypattern.bread.Bread.Companion.BAG
import com.lesaga.gonzalez.oscar.factorypattern.bread.Bread.Companion.ROLL
import com.lesaga.gonzalez.oscar.factorypattern.bread.Bread.Companion.SLICE
import com.lesaga.gonzalez.oscar.factorypattern.bread.BreadFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniData()
    }

    private fun iniData() {
        var breadFactory = BreadFactory()
        text_view.text = "${breadFactory.getBread(BAG)?.name()} \n ${breadFactory.getBread(ROLL)?.name()} \n ${breadFactory.getBread(SLICE)?.name()}"
    }
}
