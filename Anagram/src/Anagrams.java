public class Anagrams {
    
    private static boolean isAnagram(String a, String b) {
        String argument1 = a.replace(" ", "");
        String argument2 = b.replace(" ", "");

        if (argument1.length() != argument2.length()) {
            return false;
        } 
        argument1 = argument1.toLowerCase();
        argument2 = argument2.toLowerCase();
        /*
         * Hop in https://www.w3schools.com/java/ref_string_replacefirst.asp to see how replaceFirst works.
         */
        for (int i = 0; i < argument2.length(); i++) {
            argument1 = argument1.replaceFirst(String.valueOf(argument2.charAt(i)), "");
        }
        return argument1.isEmpty() ? true : false;
}
    public static void main(String[] args) { 
        String argument1 = "the classroom", argument2 = "schoolmaster";
        boolean isAnagram = isAnagram(argument1, argument2);
        System.out.println(argument1+" and "+argument2+ " is "+ (isAnagram ? "a" : "not a")+ " Anagram.");

        String argument3 = "below", argument4 = "elbow";
        boolean isAnagram2 = isAnagram(argument3, argument4);
        System.out.println(argument3+" and "+argument4+ " is "+ (isAnagram2 ? "a" : "not a")+ " Anagram.");

        String argument5 = "eleven plus two", argument6 = "twelve plus one";
        boolean isAnagram3 = isAnagram(argument5, argument6);
        System.out.println(argument5+" and "+argument6+ " is "+ (isAnagram3 ? "a" : "not a")+ " Anagram.");

        String argument7 = "older and wiser", argument8 = "I learned words";
        boolean isAnagram4 = isAnagram(argument7, argument8);
        System.out.println(argument7+" and "+argument8+ " is "+ (isAnagram4 ? "a" : "not a")+ " Anagram.");

        String argument9 = "study", argument10 = "dusti";
        boolean isAnagram5 = isAnagram(argument9, argument10);
        System.out.println(argument9+" and "+argument10+ " is "+ (isAnagram5 ? "a" : "not a")+ " Anagram.");
    }
}
