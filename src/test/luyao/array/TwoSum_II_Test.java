package test.luyao.array;

import main.luyao.array.TwoSum_II;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lu
 * on 2017/8/2 22:38
 */
public class TwoSum_II_Test {

    @Test
    public void solution() throws Exception {
        int[] nums={3,2,8,2};
        int target=11;
        int[] result= TwoSum_II.solution(nums,target);
        assertEquals(result[0],1);
        assertEquals(result[1],3);
    }

}