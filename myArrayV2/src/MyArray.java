public class MyArray {
    String[] elements;
    public int length;

    public void add(String element) {

        if (elements == null) {
            elements = new String[1];
            elements[0] = element;
        } else {
            String[] newElements = new String[elements.length + 1];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            newElements[elements.length] = element;
            elements = newElements;
        }
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