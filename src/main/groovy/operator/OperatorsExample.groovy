package main.groovy.operator

class OperatorsExample {
    public static void main(String[] args) {
        println("********* Not In Example *********")
        notInExample()
        println("********* Not In Instanceof Example *********")
        notInstanceOfExample()
        println("********* Elvis Shortened Example *********")
        elvisExample()
        println("********* Identity comparison Example *********")
        identityComparison()
        println("********* Safe Indexing Example *********")
        safeIndexing()
    }

    static void notInExample() {
        println(4 !in [1, 3, 5, 7])
    }

    static void notInstanceOfExample() {
        println(45 !instanceof Date)
    }

    static void elvisExample() {
        def he = new Element(name: 'Helium')
        he.with {
            name = name ?: 'Hydrogen'
            atomicNumber ?= 2
        }

        println(he.toString() == 'Element(Helium, 2)')
    }

    static void identityComparison() {
        def cat = new Creature(type: 'cat')
        def copyCat = cat
        def lion = new Creature(type: 'cat')
        println("#### Equals Method Invocation ###")
        println(cat.equals(lion))
        println("#### Double Equals Statement ###")
        println(cat == lion)

        //Groovy
        println("#### Using is() method Invocation ###")
        println("cat.is(copyCat) ${cat.is(copyCat)}")
        println("#### Type Safety Statement ###")
        println("cat === copyCat ${cat === copyCat}")
        println("cat !== lion ${cat !== lion}")
    }

    static safeIndexing() {
        String[] array = ['a', 'b']
        println("Printing value of index 1")
        println(array ? [1])
        println("Modifying value of index 1")
        array ? [1] = 'c'
        println("Re-Printing value of index 1")
        println(array ? [1])
        println("nullify the array")
        array = null
        println("Re-Printing value of index 1")
        println(array ? [1])
        println("Modifying value of index 1")
        array ? [1] = 'c'
        println("Re-Printing value of index 1")
        println(array ? [1])
    }
}