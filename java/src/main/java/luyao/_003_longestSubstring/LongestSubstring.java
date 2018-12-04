/*
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

package luyao._003_longestSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by luyao
 * on 2018/12/4 9:27
 */
class LongestSubstring {

    /*
     * Time : O(n^2)
     * Space : O(n)
     */
    public int solution1(String s) {
        if (s.equals("")) return 0;
        Set<Character> subString = new HashSet<>();
        int maxLength = 1, length = 1; // 最小为 1
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                Character ss = s.charAt(j);
                if (subString.contains(ss)) {
                    maxLength = Math.max(subString.size(), maxLength);
                    subString.clear();
                } else {
                    subString.add(ss);
                }
                length = subString.size();
                if (j == s.length() - 1) subString.clear();
            }
            maxLength = Math.max(maxLength, length);

        }
        return maxLength;
    }

    public int solution2(String s) {
        int maxLength = 0;
        HashMap<Character, Integer> subString = new HashMap<>();
        for (int i = 0, j = 0; j < s.length(); j++) {
            if (subString.containsKey(s.charAt(j))) {
                i = Math.max(subString.get(s.charAt(j)),i);
            }
            subString.put(s.charAt(j), j + 1);
            maxLength = Math.max(maxLength, j - i + 1);

        }
        return maxLength;
    }
}
