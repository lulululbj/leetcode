package test.luyao.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by luyao
 * on 2017/8/28 10:04
 */
public class RemoveElementTest {

    @Test
    public void solution() {
        int[] num1 = {3, 2, 2, 3};
        int[] num2 = {1, 2, 3, 2};


        assertEquals(RemoveElement.solution(num1, 2), 2);
        assertEquals(num1[0], 3);
        assertEquals(num1[1], 3);

        assertEquals(RemoveElement.solution(num2, 2), 2);
        assertEquals(num2[0], 1);
        assertEquals(num2[1], 3);
    }

}