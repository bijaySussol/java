import java.util.ArrayList;

public class CommonWords {

    /*
     * getCharacterInArray method takes String as a argument and returns the character in the array
     */
    private static char[] getCharacterInArray(String words) {
        return words.toLowerCase().toCharArray();
    }
    /*
     * getUniqueWords method takes Character as a argument and returns the unique words in the arrayList which type is of Character
     * This will reduce the number of loops so is for optimization
     */
    private static ArrayList<Character> getUniqueWords(char[] words) {
        ArrayList<Character> uniqueWordCharacters = new ArrayList<Character>();
        for (char thisWordCharacter : words) {
            if (!uniqueWordCharacters.contains(thisWordCharacter)) {
                uniqueWordCharacters.add(thisWordCharacter);
            }
        }
        return uniqueWordCharacters;
    }
    /*
     * wordPrintNumberOfOccurances take ArrayList of type Character and original input of type String and tells the users the number of occurrences of that character
     * This is only trigger when the number of occurrences is all the same number example 'codegym' as a input argument. The characters are not repeated so all
     * the character holds the same length resulting unable to find the highest occurrence of characters.
     */
    private static void printNumberOfOccurances(ArrayList<Character> characters, String input) {
        for (Character character : characters) {
            int occurences =numberOfOccurances(input, character);
            System.out.println("Occurences of character "+character+": "+occurences);
        }
    }
    
    /*
     * numberOfOccurances returns the number of count of each word in the input string
     */
    private static int numberOfOccurances(String input, char character) {
        return (int) input.chars().filter(ch -> ch == character).count();
    }
    
    /*
     * getMaxCount returns all the count of the characters in the provided word counts string
     */
    private static ArrayList<Integer> getMaxCount(ArrayList<Integer> wordsCount) {
        wordsCount.sort( (a, b) -> { return -1 * a.compareTo(b); } );
                return wordsCount;
    }
    
    /*
     * getWordsCounts returns the count of words and prepare for getMaxCount
     */
    private static ArrayList<Integer> getWordsCounts(ArrayList<Character> characters, String input) {
        ArrayList<Integer> wordsCount = new ArrayList<Integer>();
        for (Character character : characters) {
            int occurences = numberOfOccurances(input, character);
            wordsCount.add(occurences);
        }
        return wordsCount;
    }
    
    /*
     * displayResult displays the result.
     */
    private static void displayResult(ArrayList<Character> characters, int maximumRepeatedCount, String input) {
        for (Character character : characters) {
            int occurences = numberOfOccurances(input, character);
            if (occurences == maximumRepeatedCount) {
                System.out.println("Common letter in given string is: "+"'"+character+"'"+" and has total of " + occurences+" occurrences.");
            }
        }
    }
    public static void main(String[] args) {
        String input = "javaaavjjjjjaa";
        char [] words = getCharacterInArray(input);
        if (words.length>0) {
            ArrayList<Character> uniqueWordCharacters = getUniqueWords(words);
            if (uniqueWordCharacters.size() == words.length) {
                System.out.println("Cannot find the most repeated word in the provided arguments. See below occurances.");
                printNumberOfOccurances(uniqueWordCharacters, input);
            } else {
                ArrayList<Integer> wordsCounts = new ArrayList<Integer>();
                wordsCounts = getWordsCounts(uniqueWordCharacters, input);
                printNumberOfOccurances(uniqueWordCharacters, input);
                wordsCounts = getMaxCount(wordsCounts);
                int maximumRepeatedCount = wordsCounts.getFirst();
                displayResult(uniqueWordCharacters, maximumRepeatedCount, input);
            }
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}
