package leetcode._283_move_zeroes;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZeroesTest {

    @Test
    public void solution(){
        int[] nums = new int[]{0,1,0,3,12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.solution(nums);
        assertArrayEquals(new int[]{1,3,12,0,0},nums);

        int[] nums2 = new int[]{1};
        moveZeroes.solution(nums2);
        assertArrayEquals(new int[]{1},nums2);

        int[] nums3 = new int[]{1,0,0,1};
        moveZeroes.solution(nums3);
        assertArrayEquals(new int[]{1,1,0,0},nums3);
    }

    @Test
    public void solution2(){
        int[] nums = new int[]{0,1,0,3,12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.solution2(nums);
        assertArrayEquals(new int[]{1,3,12,0,0},nums);

        int[] nums2 = new int[]{1};
        moveZeroes.solution2(nums2);
        assertArrayEquals(new int[]{1},nums2);

        int[] nums3 = new int[]{1,2,0,1};
        moveZeroes.solution2(nums3);
        assertArrayEquals(new int[]{1,2,1,0},nums3);
    }

}