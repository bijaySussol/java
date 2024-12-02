import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Milan", "Marco", "Lucy", "Alexandra"};
        String[] longerThan = getLongerThan(names, 8);
        System.out.println(Arrays.toString(longerThan));
        System.out.println(Arrays.toString(getLongerThan(names, 3)));
        System.out.println(Arrays.toString(getLongerThan(names, 5)));
        MyArray myArray = new MyArray();
        MyArray myArray2 = new MyArray();
        
        /*
         * Approach 2
         */
        String [] myNewArray2 = new String[] {};
        myNewArray2 = myArray2.addUsingArrayCopyOf(myNewArray2, "Java");
        myNewArray2 = myArray2.addUsingArrayCopyOf(myNewArray2, "Hello");
        myNewArray2 = myArray2.addUsingArrayCopyOf(myNewArray2, "World");
        System.out.println("Current elements in myNewArray2: "+Arrays.toString(myNewArray2));
        System.out.println("Found element in myNewArray2 is: "+myArray.get(myNewArray2,2));
        System.out.println("Array length in myNewArray2: "+myArray.size(myNewArray2));

        /*
         * Approach 1
         */

        String [] myNewArray = new String[] {};
        myNewArray = myArray.add(myNewArray, "Lucy");
        myNewArray = myArray.add(myNewArray, "Milan");
        myNewArray = myArray.add(myNewArray, "CodeGym");
        System.out.println("Current elements in myNewArray: "+Arrays.toString(myNewArray));
        System.out.println("Found element in myNewArray is: "+myArray.get(myNewArray,7));
        System.out.println("Array length in myNewArray: "+myArray.size(myNewArray));
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