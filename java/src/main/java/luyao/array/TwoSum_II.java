package luyao.array;

/*
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * The function _001_twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 *You may assume that each input would have exactly one solution and you may not use the same element twice.
 *
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 *
 * 注意：返回的数组中下标是有序的
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lu
 * on 2017/8/2 22:35
 */
public class TwoSum_II {

    public  int[] solution(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i]))
                    return new int[]{map.get(target - numbers[i]) + 1, i + 1};

            map.put(numbers[i], i);
        }
        return null;
    }
}
