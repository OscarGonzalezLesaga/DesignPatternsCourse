package com.lesaga.gonzalez.oscar.factorypattern.bread

import com.lesaga.gonzalez.oscar.factorypattern.bread.Bread.Companion.BAG
import com.lesaga.gonzalez.oscar.factorypattern.bread.Bread.Companion.ROLL
import com.lesaga.gonzalez.oscar.factorypattern.bread.Bread.Companion.SLICE
import com.lesaga.gonzalez.oscar.factorypattern.bread.model.Baguette
import com.lesaga.gonzalez.oscar.factorypattern.bread.model.Roll
import com.lesaga.gonzalez.oscar.factorypattern.bread.model.Slice

class BreadFactory {

    fun getBread(@Bread.Companion.TypeBread breadType: String): Bread? {
        return when (breadType) {
            BAG -> Baguette()
            ROLL -> Roll()
            SLICE -> Slice()
            else -> {
                null
            }
        }
    }
}