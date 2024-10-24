import java.util.Arrays;
import java.util.Scanner;

public class App {
    static boolean isVowel(char character) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        int foundIndex = Arrays.toString(vowels).indexOf(character);
        return (foundIndex >= 0);
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter the character to validate the vowels: ");
            char character = input.next().charAt(0);
            boolean is_vowel = isVowel(character);
            System.out.println("Is vowel? "+is_vowel);
        }
    }
}