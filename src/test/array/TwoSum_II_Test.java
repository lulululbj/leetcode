package test.array;

import leetcode.array.TwoSum_II;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lu
 * on 2017/8/2 22:38
 */
public class TwoSum_II_Test {

    @Test
    public void solution() throws Exception {

        TwoSum_II twoSumIi=new TwoSum_II();

        int[] nums={1,3,2,8,2};
        int target=11;
        int target2=13;
        int[] result= twoSumIi.solution(nums,target);
        int[] result2= twoSumIi.solution(nums,target2);
        assertEquals(result[0],2);
        assertEquals(result[1],4);
        assertEquals(result2,null);


    }

}