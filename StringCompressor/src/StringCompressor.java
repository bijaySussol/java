import java.util.ArrayList;

public class StringCompressor {

    private static ArrayList<Character> getUniqueWords(char[] words) {
        ArrayList<Character> uniqueWordCharacters = new ArrayList<Character>();
        for (char thisWordCharacter : words) {
            if (!uniqueWordCharacters.contains(thisWordCharacter)) {
                uniqueWordCharacters.add(thisWordCharacter);
            }
        }
        return uniqueWordCharacters;
    }

    public static void main(String[] args) {
        System.out.println(getUniqueWords("apple".toCharArray()));
    }
}
