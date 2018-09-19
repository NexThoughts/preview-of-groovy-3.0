package main.groovy

import static java.util.stream.Collectors.toList

class LambdaExpression {
    public static void main(String[] args) {
        println("***** Iterating loop using forEach *****")
        example1()
        println("***** Example of stream/filter/map/collect *****")
        example2()
        println("***** Example of all type of variants which are in Java8 *****")
        normalVariants()
        println("***** Example of special variants which is not in Java8 *****")
        specialVariant()
    }

    static void example1() {
        (1..10).forEach((it) -> { println it })
    }

    static void example2() {
        List data = (1..10).stream()
                .filter((it) -> it % 2 == 0)
                .map((it) -> it * 2)
                .collect(toList())

        println(data)
    }

    static normalVariants() {
        println("General Form")
        def add = (int x, int y ) -> { def z = y; return x + z }
        println(add(3, 4))

        println("Curly braces are Optional")
        def sub = (int x, int y ) -> x - y
        println sub(4, 3)

        println("Parameter Type are Optional")
        def mult = (x, y) -> x * y
        println mult(3, 4)

        println("No paranthesis required for a single parameter")
        def isEven = n -> n % 2 == 0
        println isEven(6)
        println !isEven(7)

        println("No Arg Case")
        def theAnswer = () -> 42
        println theAnswer()
    }

    static void specialVariant(){
        println("Lambda Expression with default value")
        def addWithDefault = (int x, int y = 100) -> x + y
        println("Called with two value")
        println addWithDefault(1, 200)
        println("Called with one value")
        println addWithDefault(1)
    }
}
