package com.lesaga.gonzalez.oscar.abstractfactorypattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.lesaga.gonzalez.oscar.abstractfactorypattern.FactoryGenerator.Companion.BREAD
import com.lesaga.gonzalez.oscar.abstractfactorypattern.FactoryGenerator.Companion.FILLING
import com.lesaga.gonzalez.oscar.abstractfactorypattern.bread.Bread.Companion.BAG
import com.lesaga.gonzalez.oscar.abstractfactorypattern.filling.Filling.Companion.TOMATO

class MainActivity : AppCompatActivity() {

    private var TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fillingFactory = FactoryGenerator.getFactory(FILLING)
        var filling = fillingFactory?.getFilling(TOMATO)
        Log.d(TAG, filling?.name() + filling?.calories())


        var breadFactory = FactoryGenerator.getFactory(BREAD)
        var bread = breadFactory?.getBread(BAG)
        Log.d(TAG, bread?.name() + bread?.calories())
    }
}
