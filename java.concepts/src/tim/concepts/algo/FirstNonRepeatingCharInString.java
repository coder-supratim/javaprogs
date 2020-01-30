package tim.concepts.algo;

/*
 * Given a string, find the first non-repeating character in it. For example, if the input string is
 * “GeeksforGeeks”, then output should be ‘f’ and if input string is “GeeksQuiz”, then output should
 * be ‘G’.
 */
public class FirstNonRepeatingCharInString {

  public static final int arr_size = 256;
  public static char[] charCount = new char[arr_size];

  public static void getCharCounts(String str) {
    for (int i = 0; i < str.length(); i++) {
      charCount[str.charAt(i)]++;
    }
  }

  public static int getIndexofFirstNonRepeatingChar(String str) {
    getCharCounts(str);
    int index = -1, i;
    for (i = 0; i < str.length(); i++) {

      if (charCount[str.charAt(i)] == 1) {
        index = i;
        break;
      }
    }

    return index;
  }

  public static void main(String ar[]) {

    System.out
        .println("Frist non repeating char: " + getIndexofFirstNonRepeatingChar("lifeislife"));
  }
}
