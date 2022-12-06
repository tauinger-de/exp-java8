import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("Convert2MethodRef")
public class LambdaTypes {

    public static void main(String[] args) {
        ActionListener listener1 = (ActionEvent evt) -> { System.out.println(evt);};

        ActionListener listener2 = (evt) -> { System.out.println(evt);};

        ActionListener listener3 = (evt) -> System.out.println(evt);

        ActionListener listener4 = evt -> System.out.println(evt);
    }
}
