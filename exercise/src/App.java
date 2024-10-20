public class App {
    public static void main(String[] args) {
        int total_count = 5;
        for (int i = total_count; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}