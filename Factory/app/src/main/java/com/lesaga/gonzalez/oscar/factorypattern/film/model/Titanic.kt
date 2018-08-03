package com.lesaga.gonzalez.oscar.factorypattern.film.model

import com.lesaga.gonzalez.oscar.factorypattern.film.Film

class Titanic : Film {
    override fun title(): String {
        return "Titanic"
    }

    override fun duration(): Int {
        return 220
    }

    override fun resume(): String {
        return "Oh! Dibújame Jack"
    }

    override fun age(): Int {
        return 13
    }
}