package com.lesaga.gonzalez.oscar.abstractfactorypattern.drink

class Coke : Drink {
    override fun name(): String {
        return "Coca Cola"
    }

    override fun calories(): String {
        return " :140kcal"
    }
}