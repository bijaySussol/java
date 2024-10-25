import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String [] fruits_in_market = {"Apple", "Mango", "Orange"};
        int index;
        System.out.println("Enter the fruit name:");
        try (Scanner input = new Scanner(System.in)) {
            String fruitSelected = input.next();
            index = Arrays.toString(fruits_in_market).indexOf(fruitSelected);
            System.out.println((index>0) ? fruitSelected+ " is in stock!"  : "Sorry, "+fruitSelected+ " is out of stock!");
        }
    }
}