public class App {
    public static void main(String[] args) {
        int number = 4;
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + (2 * i);
        }
        System.out.println("The su of even number " + result);
    }
}