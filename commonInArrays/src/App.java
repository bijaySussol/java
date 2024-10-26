public class App {
    public static void main(String[] args) throws Exception {
        int argument1[] = {1,2,5,7,89,3,74};
        int argument2[] = {1,45,87,34,3,74};
        for (int i = 0; i < argument1.length; i++) {
            for (int j = 0; j < argument2.length; j++) {
                if (argument1[i] == argument2[j]) {
                    System.out.println("Common numbers is " + argument1[i]);
                }
            }
        }
    }
}
