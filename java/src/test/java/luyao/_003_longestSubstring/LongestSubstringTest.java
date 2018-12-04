package luyao._003_longestSubstring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by luyao
 * on 2018/12/4 9:45
 */
public class LongestSubstringTest {

    private LongestSubstring longestSubstring = new LongestSubstring();

    private String null1="";
    private String null2=" ";
    private String a = "abcabcbb";
    private String b = "bbbb";
    private String c = "pwwkew";
    private String e = "au";
    private String f = "jbpnbwwd";
    private String g = "abba";
//    private String f = "doqwrcwsyibzuyhynspjxxngfvjtmiaqzqoqskktvmspmbpbtekrexzjuiehsezrwnkrzukuielufavahhtlhswbadkt";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution1() {
        assertEquals(4, longestSubstring.solution1(f));
        assertEquals(3, longestSubstring.solution1(a));
        assertEquals(1, longestSubstring.solution1(b));
        assertEquals(3, longestSubstring.solution1(c));
        assertEquals(0, longestSubstring.solution1(null1));
        assertEquals(1, longestSubstring.solution1(null2));
        assertEquals(2, longestSubstring.solution1(e));
        assertEquals(2, longestSubstring.solution1(g));
//        assertEquals(2, longestSubstring.solution1(f));
    }

    @Test
    public void solution2() {
        assertEquals(4, longestSubstring.solution2(f));
        assertEquals(3, longestSubstring.solution2(a));
        assertEquals(1, longestSubstring.solution2(b));
        assertEquals(3, longestSubstring.solution2(c));
        assertEquals(0, longestSubstring.solution2(null1));
        assertEquals(1, longestSubstring.solution2(null2));
        assertEquals(2, longestSubstring.solution2(e));
        assertEquals(2, longestSubstring.solution2(g));
    }
}