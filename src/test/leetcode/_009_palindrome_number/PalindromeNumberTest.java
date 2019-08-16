package leetcode._009_palindrome_number;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by luyao
 * on 2019/8/16 15:07
 */
public class PalindromeNumberTest {

    @Test
    public void isPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(121));
        assertFalse(palindromeNumber.isPalindrome(-121));
        assertFalse(palindromeNumber.isPalindrome(10));
        assertTrue(palindromeNumber.isPalindrome(1));

        assertTrue(palindromeNumber.isPalindrome2(121));
        assertFalse(palindromeNumber.isPalindrome2(-121));
        assertFalse(palindromeNumber.isPalindrome2(10));
        assertTrue(palindromeNumber.isPalindrome2(1));
        assertFalse(palindromeNumber.isPalindrome2(1000021));

        assertTrue(palindromeNumber.isPalindrome3(121));
        assertFalse(palindromeNumber.isPalindrome3(-121));
        assertFalse(palindromeNumber.isPalindrome3(10));
        assertTrue(palindromeNumber.isPalindrome3(1));
        assertFalse(palindromeNumber.isPalindrome3(1000021));
    }
}