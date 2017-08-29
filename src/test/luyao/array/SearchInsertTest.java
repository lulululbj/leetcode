package luyao.array;

import main.luyao.array.SearchInsert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by luyao
 * on 2017/8/28 10:47
 */
public class SearchInsertTest {
    @Test
    public void solution() throws Exception {

        int[] nums = {1, 3, 5, 6};

        assertEquals(SearchInsert.solution(nums,5),2);
        assertEquals(SearchInsert.solution(nums,2),1);
        assertEquals(SearchInsert.solution(nums,3),1);
        assertEquals(SearchInsert.solution(nums,0),0);
        assertEquals(SearchInsert.solution(nums,7),4);

        int[] nums2 = {1, 3};
        assertEquals(1,SearchInsert.solution(nums2,2));
    }

}