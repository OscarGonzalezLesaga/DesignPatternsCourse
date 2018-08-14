package com.lesaga.gonzalez.oscar.abstractfactorypattern.bread


class Slice : Bread {
    override fun calories(): String {
        return ": 80 kcal"
    }

    override fun name(): String {
        return "Pan de molde"
    }
}