import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arguments = new ArrayList<>();
        arguments.add(5);
        arguments.add(4);
        arguments.add(3);
        arguments.add(2);
        arguments.add(1);        
        if (!arguments.isEmpty()) {
            reverseNumber(arguments);
        } else {
            System.out.println("No arguments specified!");
        }
    }
    static void reverseNumber(ArrayList<Integer> arguments) {
            Collections.reverse(arguments);
            System.out.println(arguments);
    }
}