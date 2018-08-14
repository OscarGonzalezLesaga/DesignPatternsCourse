package com.lesaga.gonzalez.oscar.abstractfactorypattern.filling

class Ham : Filling {
    override fun name(): String {
        return "Jamón"
    }

    override fun calories(): String {
        return " : 194 kcal"
    }

}