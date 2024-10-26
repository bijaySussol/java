import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(20);
        list.add(45);
        list.add(37);
        list.add(5);
        list.add(9);
        list.add(87);
        list.add(57);
        list.add(88);
        System.out.println("Min value is: "+Collections.min(list));
        System.out.println("Max. value is: "+Collections.max(list));
    }
}