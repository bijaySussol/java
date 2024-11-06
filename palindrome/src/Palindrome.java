public class Palindrome {
    static String revereString(String input) {
        String input_revereString = "";
        for (int i = (input.length() - 1); i >= 0; --i) {
            input_revereString = input_revereString + input.charAt(i);
        }
        return input_revereString.toLowerCase();
    }
    static boolean isPalindrome(String input, String reverseString) {
        return (input.equals(reverseString));
    }
    public static void main(String[] args) {
        String input = "Hannah", input_revereString = "";
        input_revereString = revereString(input);
        boolean isPalindrome = isPalindrome(input.toLowerCase(), input_revereString);
        System.out.println("Is " +input+" Palindrome? "+ isPalindrome);
        String input2 = "Banana", input_revereString2 = "";
        input_revereString2 = revereString(input2);
        boolean isPalindrome2 = isPalindrome(input2.toLowerCase(), input_revereString2);
        System.out.println("Is " +input2+" Palindrome? "+ isPalindrome2);
    }
}