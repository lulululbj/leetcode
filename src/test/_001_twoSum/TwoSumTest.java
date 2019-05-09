package test._001_twoSum;

import leetcode._001_twoSum.TwoSum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by luyao
 * on 2018/10/22 14:36
 */
public class TwoSumTest {

    @Test
    public void twoSum() {

        TwoSum twoSum = new TwoSum();

        int[] nums = {3, 2, 8, 2};
        int target = 11;
        int target2 = 12;

        int[] result = twoSum.solution(nums, target);
        int[] result2 = twoSum.solution2(nums, target);
        int[] result3 = twoSum.solution(nums, target2);
        int[] result4 = twoSum.solution2(nums, target2);

        assertEquals(nums[result[0]] + nums[result[1]], target);
        assertEquals(nums[result2[0]] + nums[result2[1]], target);
        assertNull(result3);
        assertNull(result4);
    }

}