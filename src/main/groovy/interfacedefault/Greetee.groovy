package main.groovy.interfacedefault

class Greetee implements Greetable {
    String name

    @Override
    String target() { name }
}
