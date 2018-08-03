package com.lesaga.gonzalez.oscar.factorypattern.bread.model

import com.lesaga.gonzalez.oscar.factorypattern.bread.Bread

class Baguette : Bread {

    override fun name(): String {
        return "Baguette"
    }

    override fun calories(): String {
        return ": 250 kcal"
    }

}