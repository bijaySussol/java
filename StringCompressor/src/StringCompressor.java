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

    private static int countCharacterOccurances(String inputString, char targetCharacter) {
        return (int) inputString.chars()
                    .filter(c -> c == targetCharacter)
                    .count();
    }

    public static void main(String[] args) {
        String inputString = "banana";
        ArrayList<Character> uniqueCharacters = getUniqueWords(inputString.toCharArray());
        for(char targetCharacter: uniqueCharacters) {
            System.out.println("Char count for "+targetCharacter+" "+countCharacterOccurances(inputString, targetCharacter));
        }
    }
}
