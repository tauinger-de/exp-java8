import java.util.function.Consumer;

public class LambdaHerleitung {

    public Runnable createRunnable() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.printf("Hi\n");
            }
        };
        return runnable;
    }

    public Runnable createRunnableLambda() {
        Runnable runnable = () -> System.out.printf("Hi\n");
        return runnable;
    }

    public static void main(String[] args) {
        new LambdaHerleitung().createRunnableLambda();
        Consumer<String> cons = (s) -> System.out.println(s);
        Processor<String> proc = System.out::println;

    }
}
