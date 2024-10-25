public class App {
    public static void main(String[] args) throws Exception {
        int [] numbers = {10,2,3,4,5,6,7,8,9,1,11,25,60};
        for(int number: numbers) {
            System.out.println((number % 2 == 0) ? "even number "+number : "odd number "+number);
        }
    }
}