package luyao._001;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * 给定 int 数组 和指定值 target，返回不重复的两个元素下标，使得这两个元素之和等于 target
 */

/**
 * Created by Lu
 * on 2017/7/26 23:47
 */
public class TwoSum {

    /**
     * Time Complexity: O(n2)
     * Space Complexity: O(1)
     */
    public int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }

    /**
     * Time Complexity: O(n)   仅一次循环
     * Space Complexity: O(n)  最多n个元素的HashTable
     */
    public int[] solution2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[]{i, map.get(target - nums[i])};
            map.put(nums[i], i);
        }
        return null;
    }
}
