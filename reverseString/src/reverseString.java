public class ReverseString {
    String argument;
        public ReverseString(String value) {
            if (value.equals("")) {
                value = "Apple";// Default value
            }
            argument = value;
    };
    static void stringReverse(String value) {
        int len = value.length()-1;
        for (int i = len; i >= 0; i--) {
            char result = value.charAt(i);
            System.out.print(result);
        }
    }
    public static void main(String[] args) throws Exception {
        ReverseString r = new ReverseString("Tiger");
        stringReverse(r.argument);
    }
}