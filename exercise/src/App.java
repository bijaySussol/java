public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int total_count = 5;
        for (int i = 0; i <= total_count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("x ");
                i += 1;
            }
        }
    }
}