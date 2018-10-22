package luyao.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by luyao
 * on 2017/8/25 16:31
 */
public class RemoveDuplicatesTest {


    @Test
    public void solution() {

        RemoveDuplicates removeDuplicates=new RemoveDuplicates();

        int[] nums1 = {1, 2, 3, 3, 4, 5};
        int[] nums2 = {1, 1, 2, 3, 4, 4};


        assertEquals(5, removeDuplicates.solution(nums1));
        assertEquals(1, nums1[0]);
        assertEquals(2, nums1[1]);
        assertEquals(3, nums1[2]);
        assertEquals(4, nums1[3]);
        assertEquals(5, nums1[4]);

        assertEquals(4, removeDuplicates.solution(nums2));
        assertEquals(1, nums2[0]);
        assertEquals(2, nums2[1]);
        assertEquals(3, nums2[2]);
        assertEquals(4, nums2[3]);

    }

}