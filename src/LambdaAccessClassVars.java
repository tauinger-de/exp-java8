import java.util.function.Predicate;

public class LambdaAccessClassVars {

    private static int someStaticInt = 42;

    private String someInstanceStr = "hello";

    public static void main(String[] args) {
        new LambdaAccessClassVars().init();
//        Predicate<String> p = (s) -> (someStaticInt > 10 && s.equals(someInstanceStr));
    }

    private void init() {
        Predicate<String> p = (s) -> (someStaticInt > 10 && s.equals(someInstanceStr));
    }
}
