package test.array;

import leetcode.array.PascalTriangle_II;
import org.junit.Test;
import test.utils.Utils;

import java.util.List;

/**
 * Created by Lu
 * on 2017/7/29 16:17
 */
public class PascalTriangle_II_Test {
    @Test
    public void pacsalTriangleII() throws Exception {

        PascalTriangle_II pascalTriangleIi=new PascalTriangle_II();
        int[] result1 = pascalTriangleIi.solution(1);
        int[] result2 = pascalTriangleIi.solution(2);
        int[] result3 = pascalTriangleIi.solution(3);
        int[] result4 = pascalTriangleIi.solution(4);
        List<Integer> result5 = pascalTriangleIi.solution2(4);
        List<Integer> result6 = pascalTriangleIi.pacsalTriangleII3(4);
        Utils.printArray(result1);
        Utils.printArray(result2);
        Utils.printArray(result3);
        Utils.printArray(result4);
        System.out.println(result5.toString());
        System.out.println(result6.toString());
    }

}