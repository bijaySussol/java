import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int number1, number2; // initilise the 2 variables to store the input and to store the result in result variable.
        double result;
        char operator_to_use; // operation to perform
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter first positive integer: ");
            number1 = input.nextInt(); // set the first positive integer to variable number1
            System.out.println("Enter second positive integer: ");
            number2 = input.nextInt(); // set the second positive integer to variable number2
            System.out.println("Enter the operation to perform: '+' or '-' or '*' or '/'!"); // Get the operator from the input
            operator_to_use = input.next().charAt(0);
            switch (operator_to_use) {
                case '+' -> {
                    result = number1 + number2;
                    System.out.println("This sum of:"+ number1+" and "+ number2+" is "+ result);
                }
                case '-' -> {
                    result = number1 - number2;
                    System.out.println("This substraction of:"+ number1+" and "+ number2+" is "+ result);
                }
                case '*' -> {
                    result = number1 * number2;
                    System.out.println("This multiplication of:"+ number1+" and "+ number2+" is "+ result);
                }
                case '/' -> {
                    result = number1 / number2;
                    System.out.println("This division of:"+ number1+" and "+ number2+" is "+ result);
                }
                default -> System.out.println("wrong operator used: " + operator_to_use);
            }
        }
    }
}