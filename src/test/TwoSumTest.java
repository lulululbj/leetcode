package test;

import luyao.array.TwoSum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lu
 * on 2017/7/27 00:06
 */
public class TwoSumTest {

    int[] nums={3,2,4};
    int target=6;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void twosum() throws Exception {
         int[] result= TwoSum.twosum(nums,target);
         assertEquals(nums[result[0]]+nums[result[1]],target);
    }

}