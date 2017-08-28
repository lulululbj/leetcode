package main.luyao.array;

/*
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where * it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 *
 * 给定已排序无重复元素的数组和指定值target。
 * 若target再数组中存在直接返回下标，
 * 若不存在则返回将target按顺序插入数组时的应该处于的下标值
 */

/**
 * Created by luyao
 * on 2017/8/28 10:39
 */
public class SearchInsert {

    public static int solution(int[] nums, int target) {

        if (target < nums[0]) return 0;
        if (target > nums[nums.length - 1]) return nums.length;
        for (int i = 1; i <= nums.length - 1; i++) {
            if (target == nums[i]) return i;
            if (target > nums[i - 1] && target < nums[i]) return i;
        }
        return 0;
    }
}
