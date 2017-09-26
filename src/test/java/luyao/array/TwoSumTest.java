package luyao.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lu
 * on 2017/7/27 00:06
 */
public class TwoSumTest {


    @Test
    public void twosum() throws Exception {

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
        assertEquals(null,result3);
        assertEquals(null,result4);
    }

}