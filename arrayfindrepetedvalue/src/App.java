import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        int [] arguments = new int [] {7, 8, 5, 2, 2, 6, 10, 100, 100};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arguments.length; i++) {
            for (int j = i+1; j < arguments.length; j++) {
                if (arguments[i] == arguments[j]) {
                    list.add(arguments[i]);
                }
            }
        }
        System.out.println("Repeated number in supplied arguments: " + list.toString());
    }
}