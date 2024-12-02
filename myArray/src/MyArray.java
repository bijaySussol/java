import java.util.Arrays;

public class MyArray {
    private String[] elements; // 11

    public String[] add(String [] elements, String element) {
        String [] result = new String[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            result[i] = elements[i];
        }
        result[result.length-1] = element;
        return result;
    }
    // addUsingArrayCopyOf method is eligent then add() method simply because no loop is needed
    public String[] addUsingArrayCopyOf(String [] element, String value) {
        // Arrray copyOf() method creates a copy of an array with a new length
        String [] newArray = Arrays.copyOf(element, element.length + 1);
        newArray[newArray.length - 1] = value;
        return newArray;
    }

    public String get(String [] elements, int index) {
            return (index > elements.length-1) ? "Out Of Bound": elements[index];
    }

    public int size(String [] elements) {
        return elements.length;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}