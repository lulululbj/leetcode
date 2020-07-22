package leetcode._070_climbing_stairs;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {

    @Test
    public void solution(){
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int result = climbingStairs.solution(4);
        int result2 = climbingStairs.solution2(4);
        assertEquals(5,result);
        assertEquals(5,result2);
    }
}