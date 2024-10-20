import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int total_sum = 0;
            boolean showResults = false;
            while (!showResults) {
                if (scanner.hasNextInt()) {
                    int this_number = scanner.nextInt();
                    total_sum += this_number;
                } else if (scanner.hasNextLine()) {
                    String this_line = scanner.nextLine();
                    if (this_line.equals("ENTER")) {
                        showResults = true;
                    }
                }
            }
            System.out.println("This total sum is " + total_sum);
        }
    }
}
