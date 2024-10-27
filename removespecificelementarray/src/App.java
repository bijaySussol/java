import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // from the array list
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("banana");
        list.remove(list.indexOf("mango"));

        // second soluton from the array itself
        int [] initial = new int[]{1,2,3,4,5};
        int [] refactored_array = new int[initial.length-1];
        int indexToRemove = 1;
        for(int i=0, k=0; i<initial.length; i++){
            if(i != indexToRemove) {
                refactored_array[k] = initial[i];
                k++;
            }
        }
        System.out.println("ArrayList: " + Arrays.toString(list.toArray()));
        System.out.println("Before from array: " + Arrays.toString(initial));
        System.out.println("After from array: " + Arrays.toString(refactored_array));
    }
}
