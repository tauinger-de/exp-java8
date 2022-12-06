public class OuterClass {

    private int someInt = 42;

    private class NonStaticInnerClass {
        public int foo() {
            return OuterClass.this.someInt;
        }
    }

    private Runnable createRunnable() {
        Runnable runnable = () -> {
            System.out.println("Run");
        };
        return runnable;
    }

    public void doSomething() {
        new NonStaticInnerClass().foo();
    }
}
