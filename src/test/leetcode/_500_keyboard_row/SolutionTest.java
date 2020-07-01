package leetcode._500_keyboard_row;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution(){
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};

        Solution solution = new Solution();
        String[] result = solution.findWords(words);

        assertEquals(2,result.length);
        assertEquals("Alaska",result[0]);
        assertEquals("Dad",result[1]);
    }
}