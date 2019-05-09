package array;

import leetcode.array.ArrayPartition_I;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lu
 * on 2017/8/2 22:20
 */
public class ArrayPartition_I_Test {
    @Test
    public void solution() throws Exception {

        ArrayPartition_I arrayPartition = new ArrayPartition_I();
        int[] nums = {1, 3, 2, 4};
        int[] nums2 = {1, 5, 2, 4, 3, 7};

        assertEquals(arrayPartition.solution(nums), 1 + 3);
        assertEquals(arrayPartition.solution(nums2), 1 + 3 + 5);
    }

}