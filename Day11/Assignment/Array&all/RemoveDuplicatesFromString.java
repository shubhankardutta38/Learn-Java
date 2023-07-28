public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        String inputString = "abbcdddeeffgg";

        // Using StringBuffer to remove duplicates
        String resultWithBuffer = removeDuplicatesWithStringBuffer(inputString);
        System.out.println("Result using StringBuffer: " + resultWithBuffer);

        // Using StringBuilder to remove duplicates
        String resultWithBuilder = removeDuplicatesWithStringBuilder(inputString);
        System.out.println("Result using StringBuilder: " + resultWithBuilder);
    }

    public static String removeDuplicatesWithStringBuffer(String input) {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (buffer.indexOf(String.valueOf(currentChar)) == -1) {
                buffer.append(currentChar);
            }
        }

        return buffer.toString();
    }

    public static String removeDuplicatesWithStringBuilder(String input) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (builder.indexOf(String.valueOf(currentChar)) == -1) {
                builder.append(currentChar);
            }
        }

        return builder.toString();
    }
}
