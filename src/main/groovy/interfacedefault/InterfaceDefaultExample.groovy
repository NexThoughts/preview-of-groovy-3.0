package main.groovy.interfacedefault

class InterfaceDefaultExample {
    public static void main(String[] args) {
        def daniel = new Greetee(name: 'Daniel')
        println("${daniel.salutation()}, ${daniel.target()}")
        println("***********Default Method Execution*****************")
        println(daniel.greet())
    }
}
