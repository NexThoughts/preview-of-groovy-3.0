package main.groovy.reference

import java.util.stream.Stream
import static java.util.stream.Collectors.toList

class ReferencesExample {
    public static void main(String[] args) {
        example1()
        example2()
        example3()
        example4()
        example5()
    }

    static void example1() {
        List data = Stream.of(1, 2, 3)
                .map(String:: valueOf)
                .collect(toList())

        println data
    }

    static void example2() {
        List data = ['a', 'b', 'c'].stream()
                .map(String:: toUpperCase)
                .collect(toList())
        println data
    }

    static void example3() {
        def r = Random:: new
                println r().nextInt(10) in 0..9
    }

    static void example4() {
        def a = Animal::new
        println a('lion').kind
    }
    static void example5() {
        def c = Animal
        println c::new('cat').kind
    }
}
