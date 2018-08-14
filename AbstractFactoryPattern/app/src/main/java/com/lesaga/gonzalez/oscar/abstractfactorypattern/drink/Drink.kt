package com.lesaga.gonzalez.oscar.abstractfactorypattern.drink

import android.support.annotation.StringDef

interface Drink {
    fun name(): String
    fun calories(): String

    companion object {
        @StringDef(COKE, BEER)
        @Retention(AnnotationRetention.SOURCE)
        annotation class TypeDrink

        const val COKE = "Coke"
        const val BEER = "Beer"
    }
}