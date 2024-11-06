import java.util.Arrays;

public class Longest {

    /*
     * see Math method: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
     */
    static int findMinimumLength(int min, int max) {
        return Math.min(min, max);
    }
    static int findCharacterLength(int min, String firstElement, String lastElement) {
        int charaterLength = 0;
        while (charaterLength < min && firstElement.charAt(charaterLength) == lastElement.charAt(charaterLength)) {
            charaterLength++;
        }
        return charaterLength;
    }

    static String longestCommonPrefix(String[] argumentStrings) { 
        if (argumentStrings.length == 0 || argumentStrings == null) return "Out of bounds";
        /*
         * Sorts the specified array into ascending numerical order., see: https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
         */
        Arrays.sort(argumentStrings); 
        /*
         * With this sort order, get the first element and the last element and find the minimum length to loop over and return the common prefix
         */
        String firstElement = argumentStrings[0];
        String lastElement = argumentStrings[argumentStrings.length - 1];
        int minimumLength = findMinimumLength(firstElement.length(), lastElement.length());
        int charaterLength = findCharacterLength(minimumLength, firstElement, lastElement); // Find the chacter length to go upto the first element.
        return (charaterLength == 0) ? "NOT FOUND" : firstElement.substring(0, charaterLength);
    }
    public static void main(String[] args) {
        String[] argumets = {"People like codeGym", "People like codeGym and features"};
        String[] argumets2 = {"apple", "application", "ape"};;
        String[] argumets3 = {"application", "application", "appli"};
        String[] argumets4 = {"Johnny Johnny Yes Papa", "Johnny Johnny Yes Mama"};
        String[] argumets5 = {"Apple", "Mango", "Grapes"};

        System.out.println("The longest common prefix in: "+argumets+" is: "+ longestCommonPrefix(argumets));
        System.out.println("The longest common prefix in: "+argumets2.toString()+" is: "+ longestCommonPrefix(argumets2));
        System.out.println("The longest common prefix in: "+argumets3.toString()+" is: "+ longestCommonPrefix(argumets3));
        System.out.println("The longest common prefix in: "+argumets4.toString()+" is: "+ longestCommonPrefix(argumets4));
        System.out.println("The longest common prefix in: "+argumets5.toString()+" is: "+ longestCommonPrefix(argumets5));
    }
}