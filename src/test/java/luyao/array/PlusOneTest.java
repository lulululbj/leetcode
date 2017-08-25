package luyao.array;

import luyao.array.PlusOne;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lu
 * on 2017/7/27 23:15
 */
public class PlusOneTest {


    @Test
    public void plusOne() throws Exception {
         assertEquals(123,toInt(new int[]{1,2,3}));
         assertEquals(124, toInt(PlusOne.solution(new int[]{1,2,3})));
         assertEquals(130, toInt(PlusOne.solution(new int[]{1,2,9})));
         assertEquals(1000, toInt(PlusOne.solution(new int[]{9,9,9})));
    }

    public int toInt(int[] digits) {
        int sum=0;
        for (int i=0;i<digits.length;i++){
            sum+=digits[i]*Math.pow(10,digits.length-1-i);
        }
        return sum;
    }

}