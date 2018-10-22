package luyao.array;

/*
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
 *
 * Example 1:
 * Input: [1,2,3]
 * Output: 6
 * Example 2:
 * Input: [1,2,3,4]
 * Output: 24
 * Note:
 * The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
 * Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 *
 * 给定一个数组，任取三个元素使得乘积最大
 * 思路： 给数组排序之后，其实只需要考虑两种情况：最大的三个数之积，最小的两个数和最大的一个数之积。
 */

import java.util.Arrays;

/**
 * Created by luyao
 * on 2017/9/8 15:05
 */
public class Maximum_Product_Of_Three_Numbers {

    /**
     * 时间，空间复杂度均为排序操作所消耗
     * Time complexity : O(nlog(n))
     * Space complexity : O(log(n))
     */
    public  int solution(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3],
                nums[0] * nums[1] * nums[nums.length - 1]);
    }

    /**
     * 不排序，遍历数组找出最大的三个值和最小的两个值
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public  int solution2(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i < min1) {
                min2 = min1;
                min1 = i;
            } else if (i < min2) {
                min2 = i;
            }

            if (i > max1) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max3 = max2;
                max2 = i;
            } else if (i > max3) {
                max3 = i;
            }
        }
        return Math.max(max1 * max2 * max3, max1 * min1 * min2);
    }
}
