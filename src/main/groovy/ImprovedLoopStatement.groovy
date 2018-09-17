package main.groovy

class ImprovedLoopStatement {

    public static void main(String[] args) {
        println("Example 1: Enhanced Classic Loop")
        enhancedClassicLoop()
        println("Example 2: Do While Introduced")
        doWhileExample()
        println("Example 3: Factorial using Do While")
        factorial()
        println("Example 4: Multi-Assignment in For Loop")
        multipleAssignmentInLoop()
    }

    static void enhancedClassicLoop() {
        def facts = []
        def count = 5
        println("??????????")
        for (int fact = 1, i = 1; i <= count; i++, fact *= i ) {
            facts << fact
        }
        println(facts)
    }

    static void doWhileExample() {
        int i = 0;
        do {
            i++
            println(i)
        }
        while (i < 5)

            println(i)
        assert i == 5
    }

    static void factorial() {
        def count = 5
        def fact = 1
        do {
            fact *= count--
        }
        while (count > 1)

            println(fact)
    }

    static void multipleAssignmentInLoop() {
        def baNums = []
        for (
        def (String u, int v) = ['bar', 42]; v < 45; u++, v++ ) {
            baNums << "$u $v"
        }
        println baNums
    }
}
