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

  public static char getIndexofFirstNonRepeatingChar(String str) {
    getCharCounts(str);
    int index = -1, i;
    for (i = 0; i < str.length(); i++) {

      if (charCount[str.charAt(i)] == 1) {
        index = i;
        break;
      }
    }

    return str.charAt(index);
  }

  public static void main(String[] args) {

    System.out
        .println("First non repeating char is : " + getIndexofFirstNonRepeatingChar("lifeislife"));
  }
}
