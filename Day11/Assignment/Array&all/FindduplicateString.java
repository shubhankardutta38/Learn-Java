import java.util.HashMap;

public class FindduplicateString {

    public static void main(String[] args) {
        String[] array = {"apple", "orange", "banana", "apple", "grapes", "orange"};

        // Call the method to find duplicate strings in the array
        String[] duplicates = findDuplicateStrings(array);

        System.out.println("Duplicate strings in the array:");
        for (String duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }

    public static String[] findDuplicateStrings(String[] arr) {
        HashMap<String, Integer> stringCountMap = new HashMap<>();

        for (String str : arr) {
            stringCountMap.put(str, stringCountMap.getOrDefault(str, 0) + 1);
        }

        int duplicateCount = 0;
        for (int count : stringCountMap.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }

        // Create a new array to store the duplicate strings
        String[] duplicates = new String[duplicateCount];
        int index = 0;

    
        for (String str : stringCountMap.keySet()) {
            int count = stringCountMap.get(str);
            if (count > 1) {
                duplicates[index++] = str;
            }
        }

        return duplicates;
    }
}
