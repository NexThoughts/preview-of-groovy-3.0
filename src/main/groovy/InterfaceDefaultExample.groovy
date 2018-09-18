package main.groovy

interface Greetable {
    String target()

    default String salutation() {
        'Greetings'
    }

    default String greet() {
        "${salutation()}, ${target()}"
    }
}

class Greetee implements Greetable {
    String name
    @Override
    String target() { name }
}

class InterfaceDefaultExample {
    public static void main(String[] args) {
        def daniel = new Greetee(name: 'Daniel')
        println("${daniel.salutation()}, ${daniel.target()}")
        println(daniel.greet())
    }
}
