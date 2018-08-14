package com.lesaga.gonzalez.oscar.abstractfactorypattern.drink

class Beer : Drink {
    override fun name(): String {
        return "Cerveza"
    }

    override fun calories(): String {
        return ": 155 kcal"
    }
}