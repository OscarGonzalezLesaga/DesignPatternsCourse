package com.lesaga.gonzalez.oscar.factorypattern.bread.model

import com.lesaga.gonzalez.oscar.factorypattern.bread.Bread

class Slice : Bread {
    override fun calories(): String {
        return ": 80 kcal"
    }

    override fun name(): String {
        return "Pan de molde"
    }
}