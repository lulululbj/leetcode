package luyao.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by luyao
 * on 2017/9/8 13:58
 */
public class Maximum_Average_Subarray_ITest {

    @Test
    public void findMaxAverage() throws Exception {

        Maximum_Average_Subarray_I maximumAverageSubarrayI=new Maximum_Average_Subarray_I();
        int[] nums = {2, 1, 5, 2, 5};

        assertEquals(4d, maximumAverageSubarrayI.solution(nums, 3), 0);
        assertEquals(4d, maximumAverageSubarrayI.solution2(nums, 3), 0);

        int[] nums2 = {1, 12, -5, -6, 50, 3};

        assertEquals(12.75, maximumAverageSubarrayI.solution(nums2, 4), 0);
        assertEquals(12.75, maximumAverageSubarrayI.solution2(nums2, 4), 0);

        int[] nums3 = {-1};

        assertEquals(-1, maximumAverageSubarrayI.solution(nums3, 1), 0);
        assertEquals(-1, maximumAverageSubarrayI.solution2(nums3, 1), 0);
    }

}