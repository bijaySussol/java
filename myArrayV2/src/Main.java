import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Milan", "Marco", "Lucy", "Alexandra"};
        String[] longerThan = getLongerThan(names, 8);
        System.out.println(Arrays.toString(longerThan));
        System.out.println(Arrays.toString(getLongerThan(names, 3)));
        System.out.println(Arrays.toString(getLongerThan(names, 5)));
        MyArray myArray = new MyArray();
        myArray.add("Lucy");
        myArray.add("Milan");
        myArray.add("DEF");
        myArray.add("ABC");
        System.out.println("I have below elements in arrays:");
        for (int i = 0; i < myArray.elements.length; i++) {
            System.out.println(myArray.elements[i]);
        }
        System.out.println("Found elements are: "+myArray.get(myArray.elements,2));
        System.out.println("Found elements are: "+myArray.size(myArray.elements));

        // myArray.get(5);
        // myArray.size();
    }

    private static String[] getLongerThan(String[] strings, int length) {
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() >= length) {
                count++;
            }
        }
        String[] result = new String[count];

        int index = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() >= length) {
                result[index++] = strings[i];
            }
        }

        return result;
    }
}