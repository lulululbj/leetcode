package _844_backspace_string_compare;

import leetcode._844_backspace_string_compare.BackspaceCompare;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by luyao
 * on 2020/7/22 11:10
 */
public class BackspaceCompareTest {

    @Test
    public void solution() {
        BackspaceCompare backspaceCompare = new BackspaceCompare();
        String S = "ab#c", T = "ad#c";
        Assert.assertTrue(backspaceCompare.solution(S,T));
        Assert.assertTrue(backspaceCompare.solution2(S,T));

        S = "ab##";
        T = "c#d#";
        Assert.assertTrue(backspaceCompare.solution(S,T));
        Assert.assertTrue(backspaceCompare.solution2(S,T));

        S = "a##c";
        T = "#a#c";
        Assert.assertTrue(backspaceCompare.solution(S,T));
        Assert.assertTrue(backspaceCompare.solution2(S,T));

        S = "a#c";
        T = "b";
        Assert.assertFalse(backspaceCompare.solution(S,T));
        Assert.assertFalse(backspaceCompare.solution2(S,T));
    }
}
