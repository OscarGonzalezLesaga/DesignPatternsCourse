package com.lesaga.gonzalez.oscar.factorypattern.film.model

import com.lesaga.gonzalez.oscar.factorypattern.film.Film

class FightClub : Film {
    override fun title(): String {
        return "El club de la lucha"
    }

    override fun duration(): Int {
        return 180
    }

    override fun resume(): String {
        return "Fight Club es una película satírica estadounidense de 1999 basada en la novela homónima de Chuck Palahniuk"
    }

    override fun age(): Int {
        return 18
    }
}