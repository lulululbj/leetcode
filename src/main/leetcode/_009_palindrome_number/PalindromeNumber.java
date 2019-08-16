package leetcode._009_palindrome_number;

/**
 * Created by luyao
 * on 2019/8/16 15:01
 */
public class PalindromeNumber {

    /**
     * 第一想法转成字符串，看是否为回文字符串
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public boolean isPalindrome(int x) {
        String src = String.valueOf(x);
        int a = 0;
        int b = src.length() - 1;

        while (a < b) {
            if (src.charAt(a) != src.charAt(b)) {
               return false;
            }
            a++;
            b--;
        }
        return true;
    }

    /**
     * 不转成字符串，每次比较 int 值首尾数字是否相等
     * Time Complexity: O(logN)
     * Space Complexity: O(1)
     */
    public boolean isPalindrome2(int x) {
        if (x < 0) return false;
        int div = 1;
        while (x / div >= 10) div *= 10;

        while (x > 0) {
            int a = x / div;
            int b = x % 10;
            if (a != b) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }

    /**
     * 反转后半部分数字
     * Time Complexity: O(logN)
     * Space Complexity: O(1)
     */
    public boolean isPalindrome3(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int right = 0;
        while (x > right) {
            right = right * 10 + x % 10;
            x /= 10;
        }

        return x == right || x == right / 10;
    }
}
