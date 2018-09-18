package main.groovy

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

class FromResource extends ByteArrayInputStream {
    @Override
    void close() throws IOException {
        super.close()
        println "FromResource closing"
    }

    FromResource(String input) {
        super(input.toLowerCase().bytes)
    }
}

class ToResource extends ByteArrayOutputStream {
    @Override
    void close() throws IOException {
        super.close()
        println "ToResource closing"
    }
}
