package leetcode._020_valid_parentheses;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void isValid() {
        String s1 = "()[]{}";
        String s2 = "([)]";

        ValidParentheses validParentheses = new ValidParentheses();
        assertTrue(validParentheses.isValid(s1));
        assertFalse(validParentheses.isValid(s2));
    }
}