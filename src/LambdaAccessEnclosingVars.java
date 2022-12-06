import java.util.function.Predicate;

public class LambdaAccessEnclosingVars {

    public static void main(String[] args) {
        new LambdaAccessEnclosingVars().init(12, "hello");
//        Predicate<String> p = (s) -> (someStaticInt > 10 && s.equals(someInstanceStr));
    }

    private void init(int intParam, String stringParam) {
        int n = 0;
//        Predicate<String> p = (s) -> (n++ > intParam && s.equals(stringParam));
    }
}
