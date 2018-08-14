package com.lesaga.gonzalez.oscar.abstractfactorypattern.bread

class Roll : Bread {
    override fun calories(): String {
        return ": 169 kcal"
    }

    override fun name(): String {
        return "Pan de pita"
    }
}