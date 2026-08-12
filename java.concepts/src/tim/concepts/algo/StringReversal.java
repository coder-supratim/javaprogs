package tim.concepts.algo;

/**
 * Reverse a String Without Using Built-In MethodsGoal: Take a string input and reverse its character order using low-level loops.Key Concept: Do not use StringBuilder.reverse().
 * Instead, use a simple pointer swap or loop backwards.
 */

public class StringReversal {
    static String reverseString(String string){
        char[] stringChars = string.toCharArray();
        char [] reversedChars = new char[stringChars.length];
        StringBuilder reverseString = new StringBuilder();
        for (int i = stringChars.length-1; i >= 0 ; i--){
            char temp = stringChars[i];
            reverseString.append(String.valueOf(temp));
        }
        return reverseString.toString();
    }

    public static void main(String[] args) {
        System.out.println("Reversed String: " + StringReversal.reverseString("Tigers"));

    }
}