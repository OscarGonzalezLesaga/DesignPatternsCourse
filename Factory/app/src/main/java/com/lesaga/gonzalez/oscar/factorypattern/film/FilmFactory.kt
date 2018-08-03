package com.lesaga.gonzalez.oscar.factorypattern.film

import com.lesaga.gonzalez.oscar.factorypattern.film.Film.Companion.FICHT_CLUB
import com.lesaga.gonzalez.oscar.factorypattern.film.Film.Companion.TITANIC
import com.lesaga.gonzalez.oscar.factorypattern.film.model.FightClub
import com.lesaga.gonzalez.oscar.factorypattern.film.model.Titanic

class FilmFactory {
    fun getFilm(@Film.Companion.TitleFilm title: String): Film? {
        return when (title) {
            TITANIC -> Titanic()
            FICHT_CLUB -> FightClub()
            else ->
                null

        }
    }
}