package com.lesaga.gonzalez.oscar.abstractfactorypattern.filling

import com.lesaga.gonzalez.oscar.abstractfactorypattern.AbstractFactory
import com.lesaga.gonzalez.oscar.abstractfactorypattern.bread.Bread
import com.lesaga.gonzalez.oscar.abstractfactorypattern.drink.Drink
import com.lesaga.gonzalez.oscar.abstractfactorypattern.filling.Filling.Companion.CHEESE
import com.lesaga.gonzalez.oscar.abstractfactorypattern.filling.Filling.Companion.HAM
import com.lesaga.gonzalez.oscar.abstractfactorypattern.filling.Filling.Companion.TOMATO

class FillingFactory : AbstractFactory() {
    override fun getDrink(drinkType: String): Drink? {
        return null
    }

    override fun getBread(breadType: String): Bread? {
        return null
    }

    override fun getFilling(@Filling.Companion.TypeFilling fillingType: String): Filling? {
        return when (fillingType) {
            CHEESE -> Cheese()
            TOMATO -> Tomato()
            HAM -> Ham()
            else -> {
                null
            }
        }
    }
}