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
        boolean validInputString = inputString.length() > 0;
        if (!validInputString){System.out.println("INVALID INPUT!");};
        ArrayList<Character> uniqueCharacters = getUniqueWords(inputString.toCharArray());
        String outputString = "";
        int characterCount;
        for(char targetCharacter: uniqueCharacters) {
            characterCount = countCharacterOccurances(inputString, targetCharacter);
            // System.out.println("Char count for "+targetCharacter+" "+characterCount);
            outputString = outputString+targetCharacter+(characterCount > 1 ? Integer.toString(characterCount) : "");
        }
        if (validInputString) {System.out.println("Compressed string results: "+outputString);}
    }
}
