package test.luyao.array;

import main.luyao.array.PascalTriangle_II;
import org.junit.Test;
import test.luyao.utils.Utils;

import java.util.List;

/**
 * Created by Lu
 * on 2017/7/29 16:17
 */
public class PascalTriangle_II_Test {
    @Test
    public void pacsalTriangleII() throws Exception {
        int[] result1 = PascalTriangle_II.solution(1);
        int[] result2 = PascalTriangle_II.solution(2);
        int[] result3 = PascalTriangle_II.solution(3);
        int[] result4 = PascalTriangle_II.solution(4);
        List<Integer> result5 = PascalTriangle_II.solution2(4);
        List<Integer> result6 = PascalTriangle_II.pacsalTriangleII3(4);
        Utils.printArray(result1);
        Utils.printArray(result2);
        Utils.printArray(result3);
        Utils.printArray(result4);
        System.out.println(result5.toString());
        System.out.println(result6.toString());
    }

}