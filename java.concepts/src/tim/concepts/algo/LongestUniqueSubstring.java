package tim.concepts.algo;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * 
 * Example 1:
 * 
 * Input: "abcabcbb" Output: 3 Explanation: The answer is "abc", with the length of 3.
 * 
 * @author Supratim Bhattacharya
 *
 */

public class LongestUniqueSubstring {


  public int longestSubstring(String s) {
    int n = s.length();
    int result = 0, i = 0, j = 0;
    Set<Character> charset = new HashSet<>();
    while (i < n && j < n) {
      if (!charset.contains(s.charAt(j))) {
        charset.add(s.charAt(j++));
        result = Math.max(result, j - i);
      } else {
        charset.remove(s.charAt(i++));

      }

    }
    return result;
  }

  public static void main(String sr[]) {
    LongestUniqueSubstring ls = new LongestUniqueSubstring();
    System.out.print(ls.longestSubstring("abcabcbb"));
  }
}
