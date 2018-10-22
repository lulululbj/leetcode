package luyao.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by luyao
 * on 2017/9/8 15:08
 */
public class Maximum_Product_Of_Three_NumbersTest {

    @Test
    public void solution() throws Exception {

        Maximum_Product_Of_Three_Numbers maximumProductOfThreeNumbers = new Maximum_Product_Of_Three_Numbers();

        int[] nums = {1, 2, 3};
        int[] nums2 = {3, 1, 2, 4, -2};

        int[] nums3 = {-4, -3, -2, -1, 60};
        int[] nums4 = {4, 2, 1, 3, -2};


        assertEquals(6, maximumProductOfThreeNumbers.solution2(nums));
        assertEquals(24, maximumProductOfThreeNumbers.solution2(nums2));
        assertEquals(24, maximumProductOfThreeNumbers.solution2(nums4));


        assertEquals(6, maximumProductOfThreeNumbers.solution(nums));
        assertEquals(24, maximumProductOfThreeNumbers.solution(nums2));
        assertEquals(720, maximumProductOfThreeNumbers.solution(nums3));
        assertEquals(24, maximumProductOfThreeNumbers.solution(nums4));


    }

}