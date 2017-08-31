package luyao.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by luyao
 * on 2017/8/31 9:58
 */
public class MaxProfitTest {

    @Test
    public void solution(){

        int[] prices1={7, 1, 5, 3, 6, 4};
        assertEquals(5, MaxProfit.solution(prices1));

        int[] prices2={7, 6, 4, 3, 1};
        assertEquals(0, MaxProfit.solution(prices2));
    }

}