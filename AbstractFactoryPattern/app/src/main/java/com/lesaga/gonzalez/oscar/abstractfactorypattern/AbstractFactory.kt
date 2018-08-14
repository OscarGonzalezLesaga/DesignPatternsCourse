package com.lesaga.gonzalez.oscar.abstractfactorypattern

import com.lesaga.gonzalez.oscar.abstractfactorypattern.bread.Bread
import com.lesaga.gonzalez.oscar.abstractfactorypattern.drink.Drink
import com.lesaga.gonzalez.oscar.abstractfactorypattern.filling.Filling

abstract class AbstractFactory {

    abstract fun getBread(breadType: String): Bread?

    abstract fun getFilling(fillingType: String): Filling?

    abstract fun getDrink(drinkType: String): Drink?

}