public class App {
    public static int secondMax(int [] arguments) {
        int firstMinValue = 0;
        int secondMaxValue = 0;
        // Can be used a Integer.MIN_VALUE constant but don't see reason to use here but if want to learn https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
        // loop over arguments and calculate
        for (int i = 0; i < arguments.length; i++) {
            if (arguments[i] > firstMinValue) {
                secondMaxValue = firstMinValue;
                firstMinValue=arguments[i];
            } else if (arguments[i] > secondMaxValue && arguments[i] != secondMaxValue) {
                secondMaxValue = arguments[i];
            }
        }    return secondMaxValue;
    };

    public static void main(String[] args) {
        int [] arguments = {1,9,2,7,10,11,23,24,4,89,6,87};
        System.out.println(secondMax(arguments));
    }
}