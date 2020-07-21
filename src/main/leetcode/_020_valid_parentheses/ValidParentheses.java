package leetcode._020_valid_parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ValidParentheses {

    /*
     * 遍历字符串，遇到左括号存入栈中，遇到右括号则取出栈顶左括号，判断是否匹配
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        Map<Character,Character> maps = new HashMap<>(3);
        maps.put(')','(');
        maps.put(']','[');
        maps.put('}','{');

        for (Character c : s.toCharArray()) {
            if (maps.containsKey(c)){
                Character left = stack.isEmpty() ? '+' : stack.pop();
                if (maps.get(c) != left) return false;
            }else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
