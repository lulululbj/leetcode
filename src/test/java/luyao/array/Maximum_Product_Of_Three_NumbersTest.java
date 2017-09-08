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

        int[] nums = {1, 2, 3};
        int[] nums2 = {1, 2, 3, 4};

        int[] nums3 = {-4, -3, -2, -1, 60};

        assertEquals(6, Maximum_Product_Of_Three_Numbers.solution(nums));
        assertEquals(24, Maximum_Product_Of_Three_Numbers.solution(nums2));
        assertEquals(720, Maximum_Product_Of_Three_Numbers.solution(nums3));

        assertEquals(6, Maximum_Product_Of_Three_Numbers.solution2(nums));
        assertEquals(24, Maximum_Product_Of_Three_Numbers.solution2(nums2));
        assertEquals(720, Maximum_Product_Of_Three_Numbers.solution2(nums3));
    }

}