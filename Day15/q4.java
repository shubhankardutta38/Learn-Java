/*
 * .Given a string ,write a python function to return True if
 the 
 strings  'mat' and 'jet' appear the same number
 of times in a given string ,else return False

 Jet on the Mat but mat is too long     :False
 jet Jet Mat mat:		          True
 */

class q4 {
    public static boolean compareOccurrences(String input) {

        String lower = input.toLowerCase();

        int matCount = coc(lower, "mat");
        int jetCount = coc(lower, "jet");

        return matCount == jetCount;
    }

    private static int coc(String input, String pattern) {
        int count = 0;
        int index = 0;
        while (index != -1) {
            index = input.indexOf(pattern, index);
            if (index != -1) {
                count++;
                index += pattern.length();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input1 = "Jet on the Mat but mat is too long";
        String input2 = "jet Jet Mat mat";

        System.out.println(compareOccurrences(input1));
        System.out.println(compareOccurrences(input2));
    }
}
