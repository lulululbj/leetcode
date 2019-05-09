package leetcode.array;

/*
 * Given an array and a value, remove all instances of that value in place and return the new length.
 *
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 *
 * Your function should return length = 2, with the first two elements of nums being 2.
 *
 * 移除数组中指定元素，并返回数组新的长度 k,
 * 要求：不能再创建数组，需移除的值在数组的末尾
 */

/**
 * Created by luyao
 * on 2017/8/28 9:32
 */
public class RemoveElement {

    public  int solution(int[] nums, int val) {

        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }
}
