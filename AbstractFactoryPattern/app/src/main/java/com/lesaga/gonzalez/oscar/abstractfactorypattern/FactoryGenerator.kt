package com.lesaga.gonzalez.oscar.abstractfactorypattern

import android.support.annotation.StringDef
import com.lesaga.gonzalez.oscar.abstractfactorypattern.bread.BreadFactory
import com.lesaga.gonzalez.oscar.abstractfactorypattern.drink.DrinkFactory
import com.lesaga.gonzalez.oscar.abstractfactorypattern.filling.FillingFactory

abstract class FactoryGenerator {
    companion object {

        @StringDef(BREAD, FILLING, DRINK)
        @Retention(AnnotationRetention.SOURCE)
        annotation class TypeFactory

        const val BREAD = "BRE"
        const val FILLING = "Filling"
        const val DRINK = "Drink"


        fun getFactory(@TypeFactory factoryType: String): AbstractFactory? {
            return when (factoryType) {
                BREAD -> BreadFactory()
                FILLING -> FillingFactory()
                DRINK -> DrinkFactory()
                else -> null
            }
        }
    }


}