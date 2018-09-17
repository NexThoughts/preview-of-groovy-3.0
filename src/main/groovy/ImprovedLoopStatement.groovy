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
}
