package leetcode._125_valid_palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeTest {

    String str = "A man, a plan, a canal: Panama";
    String str2 = ".,";
    ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    public void solution() {
        boolean isPalindrome = validPalindrome.solution(str);
        boolean isPalindrome2 = validPalindrome.solution(str2);
        assertTrue(isPalindrome);
        assertFalse(isPalindrome2);
    }

    @Test
    public void solution2() {
        boolean isPalindrome = validPalindrome.solution2(str);
        boolean isPalindrome2 = validPalindrome.solution2(str2);
        assertTrue(isPalindrome);
        assertFalse(isPalindrome2);
    }
}