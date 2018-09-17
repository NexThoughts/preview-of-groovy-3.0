package main.groovy

class JavaArrayInitialization {
    public static void main(String[] args) {
        example1()
        example2()
        example3()
    }

    static void example1() {
        def primes = new int[] { 2, 3, 5, 7, 11 }
        println("Size of Primes: ${primes.size()}")
        println("Sum of Primes: ${primes.sum()}")
        println("Class Name: ${primes.class.name}")
    }

    static void example2() {
        def pets = new String[] { 'cat', 'dog' }
        println("Pets Size: ${pets.size()}")
        println("Sum of: ${pets.sum()}")
        println("Class Name of Pets: ${pets.class.name}")
    }

    static void example3() {
        String[] groovyBooks = ['Groovy in Action', 'Making Java Groovy']
        println groovyBooks.every { it.contains('Groovy') }
    }
}
