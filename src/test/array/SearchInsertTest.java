package test.array;

import leetcode.array.SearchInsert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by luyao
 * on 2017/8/28 10:47
 */
public class SearchInsertTest {
    @Test
    public void solution() throws Exception {

        SearchInsert searchInsert=new SearchInsert();

        int[] nums = {1, 3, 5, 6};

        assertEquals(searchInsert.solution(nums,5),2);
        assertEquals(searchInsert.solution(nums,2),1);
        assertEquals(searchInsert.solution(nums,3),1);
        assertEquals(searchInsert.solution(nums,0),0);
        assertEquals(searchInsert.solution(nums,7),4);


        assertEquals(searchInsert.solution2(nums,5),2);
        assertEquals(searchInsert.solution2(nums,2),1);
        assertEquals(searchInsert.solution2(nums,3),1);
        assertEquals(searchInsert.solution2(nums,0),0);
        assertEquals(searchInsert.solution2(nums,7),4);

        int[] nums2 = {1, 3};
        assertEquals(1,searchInsert.solution(nums2,2));
        assertEquals(1,searchInsert.solution2(nums2,2));
    }

}