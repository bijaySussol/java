public class App {
    public static void main(String[] args) {
        int [] numbers = {2, 4, 6, 8, 10};
        int elementLength = numbers.length;
        int sumOfNumbers = 0;
        for (int i = 0; i < elementLength; i++) {
            sumOfNumbers += numbers[i];
        }
        int average = sumOfNumbers / elementLength;
        System.out.println("Average of provided numbers: " + average);
    }
}
