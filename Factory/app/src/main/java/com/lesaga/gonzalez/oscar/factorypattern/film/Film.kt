package com.lesaga.gonzalez.oscar.factorypattern.film

import android.support.annotation.StringDef

interface Film {
    fun title(): String
    fun duration(): Int
    fun resume(): String
    fun age(): Int

    companion object {

        @StringDef(TITANIC, FICHT_CLUB)
        @Retention(AnnotationRetention.SOURCE)
        annotation class TitleFilm

        const val TITANIC = "titanic"
        const val FICHT_CLUB = "fight"
    }
}