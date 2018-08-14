package com.lesaga.gonzalez.oscar.abstractfactorypattern.bread


class Baguette : Bread {

    override fun name(): String {
        return "Baguette"
    }

    override fun calories(): String {
        return ": 250 kcal"
    }

}