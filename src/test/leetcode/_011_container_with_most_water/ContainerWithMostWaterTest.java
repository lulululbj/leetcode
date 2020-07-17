package leetcode._011_container_with_most_water;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    int[] height = new int[]{1,8,6,2,5,4,8,3,7};

    @Test
    public void solution() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int max = containerWithMostWater.solution(height);
        int max2 = containerWithMostWater.solution(height);
        assertEquals(49,max);
        assertEquals(49,max2);
    }
}