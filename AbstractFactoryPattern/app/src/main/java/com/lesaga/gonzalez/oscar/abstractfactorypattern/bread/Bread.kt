package com.lesaga.gonzalez.oscar.abstractfactorypattern.bread

import android.support.annotation.StringDef

interface Bread {
    fun name(): String
    fun calories(): String

    companion object {

        @StringDef(BAG, ROLL, SLICE)
        @Retention(AnnotationRetention.SOURCE)
        annotation class TypeBread

        const val BAG = "Bag"
        const val ROLL = "Roll"
        const val SLICE = "Slice"
    }
}
