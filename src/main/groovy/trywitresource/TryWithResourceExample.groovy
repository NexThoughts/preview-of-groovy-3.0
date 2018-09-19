package main.groovy.trywitresource

class TryWithResourceExample {

    public static void main(String[] args) {
        println(wrestle("ARM was here!").contains('arm'))
    }

    static String wrestle(s) {
        try (
                FromResource from = new FromResource(s)
                ToResource to = new ToResource()
        ) {
            to << from
            return to.toString()
        }
    }
}