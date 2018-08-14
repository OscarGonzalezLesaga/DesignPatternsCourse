package com.lesaga.gonzalez.oscar.abstractfactorypattern.filling

class Tomato : Filling {
    override fun name(): String {
        return "Tomate"
    }

    override fun calories(): String {
        return " :20 kcal"
    }
}