package com.lesaga.gonzalez.oscar.abstractfactorypattern.bread

import com.lesaga.gonzalez.oscar.abstractfactorypattern.AbstractFactory
import com.lesaga.gonzalez.oscar.abstractfactorypattern.bread.Bread.Companion.BAG
import com.lesaga.gonzalez.oscar.abstractfactorypattern.bread.Bread.Companion.ROLL
import com.lesaga.gonzalez.oscar.abstractfactorypattern.bread.Bread.Companion.SLICE
import com.lesaga.gonzalez.oscar.abstractfactorypattern.drink.Drink
import com.lesaga.gonzalez.oscar.abstractfactorypattern.filling.Filling

class BreadFactory : AbstractFactory() {
    override fun getDrink(drinkType: String): Drink? {
        return null
    }

    override fun getBread(breadType: String): Bread? {
        return when (breadType) {
            BAG -> Baguette()
            ROLL -> Roll()
            SLICE -> Slice()
            else -> {
                null
            }
        }
    }

    override fun getFilling(fillingType: String): Filling? {
        return null
    }

}