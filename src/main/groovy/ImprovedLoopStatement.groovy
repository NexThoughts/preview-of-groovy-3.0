package main.groovy

class ImprovedLoopStatement {

    void enhancedClassicLoop() {
        def facts = []
        def count = 5
        println("??????????")
        for (int fact = 1, i = 1; i <= count; i++, fact *= i ) {
            facts << fact
        }
        println(facts)
    }

    void doWhileExample() {
        int i = 0;
        do {
            i++
            println(i)
        }
        while (i < 5)

            println(i)
        assert i == 5
    }

    void factorial() {
        def count = 5
        def fact = 1
        do {
            fact *= count--
        }
        while (count > 1)

            println(fact)
    }

    void multipleAssignmentInLoop() {
        def baNums = []
        for (def (String u, int v) = ['bar', 42]; v < 45; u++, v++ ) {
            baNums << "$u $v"
        }
        println baNums
    }
}
