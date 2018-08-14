package com.lesaga.gonzalez.oscar.abstractfactorypattern.drink

import com.lesaga.gonzalez.oscar.abstractfactorypattern.AbstractFactory
import com.lesaga.gonzalez.oscar.abstractfactorypattern.bread.Bread
import com.lesaga.gonzalez.oscar.abstractfactorypattern.drink.Drink.Companion.BEER
import com.lesaga.gonzalez.oscar.abstractfactorypattern.drink.Drink.Companion.COKE
import com.lesaga.gonzalez.oscar.abstractfactorypattern.filling.Filling

class DrinkFactory : AbstractFactory() {
    override fun getBread(breadType: String): Bread? {
        return null
    }

    override fun getFilling(fillingType: String): Filling? {
        return null
    }

    override fun getDrink(@Drink.Companion.TypeDrink drinkType: String): Drink? {
        return when (drinkType) {
            COKE -> Coke()
            BEER -> Beer()
            else -> null
        }
    }
}