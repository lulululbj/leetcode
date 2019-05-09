package leetcode.array;

/*
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum      * average value. And you need to output the maximum average value.
 *
 * Example 1:
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 * Note:
 * 1 <= k <= n <= 30,000.
 * Elements of the given array will be in the range [-10,000, 10,000].
 *
 * 给定一个数组，求长度为 k 且平均值最大的连续子数组
 */

/**
 * Created by luyao
 * on 2017/9/8 13:51
 */
public class Maximum_Average_Subarray_I {

    /**
     * 最简单的循环嵌套，求出最大值
     * 超时，无法通过 OJ
     */
    public  double solution(int[] nums, int k) {
        double average = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            double count = nums[i];
            for (int j = 1; j < k; j++) {
                count += nums[i + j];
            }
            double newAverage = count / k;
            if (i == 0)
                average = newAverage;
            else
                average = Math.max(average, newAverage);
        }
        return average;
    }

    /**
     * 一次遍历即可解决。就像一个滑动条一样，初始状态包含数组前k个元素并求和。
     * 每次向右滑动一位，队尾加入下一个数字，队首移除第一个数字，求和并比较保存较大值
     * 滑到数组末尾结束，得到最大值
     * <p>
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public  double solution2(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double res = sum;
        for (int i = k; i < nums.length; i++) {
            sum += (nums[i] - nums[i - k]);
            res = Math.max(sum, res);
        }
        return res / k;
    }
}
