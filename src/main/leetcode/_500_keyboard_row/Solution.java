package leetcode._500_keyboard_row;

import java.util.ArrayList;
import java.util.List;

/*
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。
 *
 * 示例:
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 */
public class Solution {

    public String[] findWords(String[] words) {
        String line1 = "qwertyuiop";
        String line2 = "asdfghjkl";
        String line3 = "zxcvbnm";

        List<String> result = new ArrayList<>();
        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();

            String match = "";
            if (line1.indexOf(lowerCaseWord.charAt(0)) != -1)
                match = line1;
            else if (line2.indexOf(lowerCaseWord.charAt(0)) != -1)
                match = line2;
            else
                match = line3;

            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if (match.indexOf(lowerCaseWord.charAt(i)) == -1) {
                    flag = false;
                    break;
                }
            }

            if (flag) result.add(word);

        }

        return result.toArray(new String[result.size()]);

    }

}
