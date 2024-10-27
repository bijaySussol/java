import java.util.ArrayList;

public class App {
    /*
     * getAverage method returns the average of the given arguments
     */
    static double getAverage(int [] arguments) {
        int average = 0;
        for (int i = 0; i < arguments.length; i++) {
            average += arguments[i];
        }
        return average/arguments.length;
    }

    /*
     * print method compars the average values returned from getAverage method aganist the arguments
     * and returns the result depending on the comparison
     */
    static void print(double average, int [] arguments) {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < arguments.length; i++) {
            if (arguments[i] > average) {
                list.add(arguments[i]);
            }
        }
        System.out.println(list.toString());
    }
    public static void main(String[] args) {
        int argument[]  = { 11, 12, 18, 20, 70, 100, 81, 2 };
        double average = getAverage(argument);
        print(average, argument);
    }
}
