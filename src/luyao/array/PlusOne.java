package luyao.array;

/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 * <p>
 * 用数组表示整数进行加1操作 如：{1,2,3} -> {1,2,4} {9,9,9} -> {1,0,0,0}
 * <p>
 * Created by Lu
 * on 2017/7/27 22:57
 */
public class PlusOne {

    public static int[] solution(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
