package main.groovy

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

class OperatorsExample {
    public static void main(String[] args) {
        notInExample()
        notInstanceOfExample()
        elvisExample()
        identityComparison()
        safeIndexing()
    }

    static void notInExample() {
        println(4 !in [1, 3, 5, 7])
    }

    static void notInstanceOfExample() {
        println(45 !instanceof Date)
    }

    static void elvisExample(){
        def he = new Element(name: 'Helium')
        he.with {
            name = name ?: 'Hydrogen'
            atomicNumber ?= 2
        }

        println(he.toString() == 'Element(Helium, 2)')
    }

    static void identityComparison(){
        def cat = new Creature(type: 'cat')
        def copyCat = cat
        def lion = new Creature(type: 'cat')

        println(cat.equals(lion))
        println(cat == lion)

        //Groovy
        println(cat.is(copyCat))
        println(cat === copyCat)
        println(cat !== lion)
    }

    static safeIndexing(){
        String[] array = ['a', 'b']
        println(array?[1])
        array?[1] = 'c'
        println(array?[1])
        array = null
        println(array?[1])
        array?[1] = 'c'
        println(array?[1])
    }
}

@ToString
class Element {
    String name
    int atomicNumber
}

@EqualsAndHashCode
class Creature { String type }
