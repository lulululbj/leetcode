package luyao.array;

import main.luyao.array.FindDisappearedNumbers;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Lu
 * on 2017/7/31 22:26
 */
public class FindDisappearedNumbersTest {


    @Test
    public void solution() throws Exception {
        int[] nums={2,2,3,4,3};
        List<Integer> result= FindDisappearedNumbers.solution(nums);
        assertEquals(result.size(),2);
        assertEquals(result.contains(1),true);
        assertEquals(result.contains(5),true);
    }

}