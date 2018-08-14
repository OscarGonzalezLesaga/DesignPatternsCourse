package com.lesaga.gonzalez.oscar.abstractfactorypattern.filling

import android.support.annotation.StringDef

interface Filling {
    fun name(): String
    fun calories(): String

    companion object {
        @StringDef(CHEESE, TOMATO, HAM)
        @Retention(AnnotationRetention.SOURCE)
        annotation class TypeFilling

        const val CHEESE = "Cheese"
        const val TOMATO = "Tomato"
        const val HAM = "Ham"
    }
}