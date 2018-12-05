package luyao._704_binary_search;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by luyao
 * on 2018/12/5 10:32
 */
public class BinarySearchTest {

    private int[] numbers1={-1,0,3,5,9,12};
    private int[] numbers2={5};

    @Test
    public void solution() {
        BinarySearch binarySearch=new BinarySearch();
        assertEquals(4,binarySearch.solution(numbers1,9));
        assertEquals(-1,binarySearch.solution(numbers1,4));
        assertEquals(0,binarySearch.solution(numbers2,5));
    }
}