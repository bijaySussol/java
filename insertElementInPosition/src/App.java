import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter number of elements you want in array:");
            if(input.hasNextInt()) {
                int userInput = input.nextInt();
                if(userInput > 0) {
                    int [] arguments = createElement(userInput);
                    int argumentsLength = arguments.length;
                    System.out.print("Enter the position where you want to insert element:");
                    if(input.hasNextInt()) {
                        int userPosition = input.nextInt();
                        if(userPosition > 0) {
                            int index = input.nextInt();
                            if(index > argumentsLength) {
                                checkInputValidity("outofbound");
                            } else {
                                System.out.print("Enter the element you want to insert:");
                                if(input.hasNextInt()) {
                                    int element = input.nextInt();
                                    if(element > 0) {
                                        insertElement(index, argumentsLength+1, element);// Argument length is +1 as we need to insert/make a room to insert new element
                                    } else {
                                        checkInputValidity("number");
                                    }
                                } else {
                                    checkInputValidity("alphabet");
                                }
                            }
                        } else {
                            checkInputValidity("number");
                        }
                    } else {
                        checkInputValidity("alphabet");
                    }
                } else {
                    checkInputValidity("number");
                }
            } else {
                checkInputValidity("alphabet");
            }
        }
    }
    static int[] createElement(int numOfElement) {
        return new int[numOfElement];
    }
    static void insertElement(int index, int length, int arguments) {
        int [] userArrays = new int[length];
        for (int i = 0; i < userArrays.length; i++) {
            if (i == index) {
                userArrays[i] = arguments;
            }
        }
        System.out.println("Succesfully inserted the element into given position: "+Arrays.toString(userArrays));
    }
    static void checkInputValidity(String type){
        switch (type) {
            case "number" -> System.out.println("Enter no. of elements - non negative!");
            case "outofbound" -> System.out.println("The position to insert must be within the range of no. of elements.");
            default -> System.out.println("Enter element/position in number!");
        }
    };
}