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
        int[] nums={3,2,8,2};
        int target=11;
         int[] result= TwoSum.solution(nums,target);
         int[] result2= TwoSum.solution2(nums,target);
         assertEquals(nums[result[0]]+nums[result[1]],target);
         assertEquals(nums[result2[0]]+nums[result2[1]],target);
    }

}