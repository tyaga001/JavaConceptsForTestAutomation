package stringProblemStatements;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {

    public static void main(String[] args) {
        findDuplicateCharacters("Java");
        findDuplicateCharacters("JavaScript");
        findDuplicateCharacters("Programming");
    }

    /*
     * Below method give us all duplicate characters in a String and print them.
     */
    private static void findDuplicateCharacters(String word) {
        char[] characters = word.toCharArray();

        Map<Character, Integer> characterIntegerMap = new HashMap<Character, Integer>();
        for (Character ch : characters) {
            if (characterIntegerMap.containsKey(ch)) {
                characterIntegerMap.put(ch, characterIntegerMap.get(ch) + 1);
            } else {
                characterIntegerMap.put(ch, 1);
            }
        }
        // Iterate through HashMap to print all duplicate characters of String
        Set<Map.Entry<Character, Integer>> entrySet = characterIntegerMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", word);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
}
