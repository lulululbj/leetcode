package luyao._704_binary_search;

/*
 * Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. If target * * exists, then return its index, otherwise return -1.
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 *
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 *
 *
 * Note:
 *
 * You may assume that all elements in nums are unique.
 * n will be in the range [1, 10000].
 * The value of each element in nums will be in the range [-9999, 9999].
 */

/**
 * Created by luyao
 * on 2018/12/5 10:17
 */
public class BinarySearch {

    public int solution(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) { //  这里的判断条件是 <=，注意 nums=[5],target=5 的情况
            int mid = low + ((high - low) / 2);
            if (target > nums[mid]) low = mid + 1;
            else if (target < nums[mid]) high = mid - 1;
            else return mid;
        }
        return -1;
    }
}
