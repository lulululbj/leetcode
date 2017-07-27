package test.array;

import luyao.array.TwoSum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lu
 * on 2017/7/27 00:06
 */
public class TwoSumTest {

    int[] nums={3,2,8,2};
    int target=11;

    @Test
    public void twosum() throws Exception {
         int[] result= TwoSum.twosum(nums,target);
         int[] result2= TwoSum.twosum2(nums,target);
         assertEquals(nums[result[0]]+nums[result[1]],target);
         assertEquals(nums[result2[0]]+nums[result2[1]],target);
    }

}