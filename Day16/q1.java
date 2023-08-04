/*
 * Represent a small bilingual (English-Swedish) glossary given
 below as a Python  dictionary
{"merry":"god", "christmas":"jul", "and":"och", "happy":"gott", 
"new":"nytt", "year":"ar"}
and use it to translate your Christmas wishes from English 
into Swedish.
That is, write a python function translate() that accepts the 
bilingual dictionary and a  list of English words (your 
Christmas wish) and returns a list of equivalent Swedish 
 words.
 */
import java.util.*;

public class q1 {
    public static void main(String[] args) {
        // Sample input
        String[] englishWords = {"merry", "christmas"};
        String[] swedishWords = translate(getBilingualDictionary(), englishWords);
        System.out.println(Arrays.toString(swedishWords)); // Output: ["god", "jul"]
    }

    public static Map<String, String> getBilingualDictionary() {
        // Create and return the bilingual dictionary
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("merry", "god");
        dictionary.put("christmas", "jul");
        dictionary.put("and", "och");
        dictionary.put("happy", "gott");
        dictionary.put("new", "nytt");
        dictionary.put("year", "ar");
        return dictionary;
    }

    public static String[] translate(Map<String, String> dictionary, String[] englishWords) {
        // Function to translate the given English words to Swedish using the provided dictionary
        String[] swedishWords = new String[englishWords.length];
        for (int i = 0; i < englishWords.length; i++) {
            String englishWord = englishWords[i];
            if (dictionary.containsKey(englishWord)) {
                swedishWords[i] = dictionary.get(englishWord);
            } else {
                // If the word is not in the dictionary, keep it as is.
                swedishWords[i] = englishWord;
            }
        }
        return swedishWords;
    }
}
