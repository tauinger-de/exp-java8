public class LambdaMethodRef {

    public static void main(String[] args) {
        Stringer s = Object::toString;

        Foo foo = new Foo();
        Stringer s2 = foo::convert;
    }
}

interface Stringer {
    String string(Object o);
}

class Foo {
    public String convert(Object o) {
        return "" + o.hashCode();
    }

    public void demo() {
        Stringer s2 = this::convert;
    }
}
