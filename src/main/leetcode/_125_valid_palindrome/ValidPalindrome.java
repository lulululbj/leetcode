package leetcode._125_valid_palindrome;

/*
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 *
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ValidPalindrome {

    /*
     * 两侧双指针向中间移动，判断字符是否相等。
     * 注意跳过非字母和数字的字符
     * 时间复杂度： O(1)
     */
    public boolean solution(String s){
        int left = 0,right = s.length() -1;
        while (left < right){
            while (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if (left < right){
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    /*
     * 正则过滤不合法字符后直接 reverse
     * 此解法注意输入是 "" 或 " "
     */
    public boolean solution2(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        if (str.isEmpty()) return false;
        String reverse = new StringBuffer(str).reverse().toString();
        return str.equals(reverse);
    }
}
