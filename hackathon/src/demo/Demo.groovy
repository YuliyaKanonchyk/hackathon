package demo

class Demo {
    private String value

    Demo(final String value) {
        this.value = value
    }

    public <T> T asType(final Class<T> c) {
        if (c == String.class) {
           return  "String value: $value" as String
        }
        if (c == Integer.class) {
            return  123 as T
        }
        if (c == int) {
            return  777 as T
        }
        super.asType(c)
    }
}
