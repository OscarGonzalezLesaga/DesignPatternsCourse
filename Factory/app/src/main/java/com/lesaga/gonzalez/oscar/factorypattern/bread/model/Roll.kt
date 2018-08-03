package com.lesaga.gonzalez.oscar.factorypattern.bread.model

import com.lesaga.gonzalez.oscar.factorypattern.bread.Bread

class Roll : Bread {
    override fun calories(): String {
        return ": 169 kcal"
    }

    override fun name(): String {
        return "Pan de pita"
    }
}