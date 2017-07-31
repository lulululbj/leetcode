package luyao.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.
 * For example, given k = 3,
 * Return [1,3,3,1].
 * Note:
 * Could you optimize your algorithm to use only O(k) extra space?
 * <p>
 * 数组形式返回帕斯卡三角形的第k行，空间复杂度为O（k）
 * <p>
 * Created by Lu
 * on 2017/7/29 16:12
 */
public class PascalTriangle_II {

    public static int[] solution(int k) {
        int[] result = new int[k];
        int previous = 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < i; j++) {
                int current = result[j];
                result[j] = previous + current;
                previous = current;
            }
        }
        return result;
    }

    public static List<Integer> solution2(int k) {
        List<Integer> result=new ArrayList<>();

       for (int i=0;i<=k;i++){
           result.add(1);
           for (int j=i-1;j>0;j--){
               result.set(j,result.get(j)+result.get(j-1));
           }
       }
        return result;
    }

    public static List<Integer> pacsalTriangleII3(int k) {
        List<Integer> result=new ArrayList<>();

        for (int i=0;i<=k;i++){
            result.add(0,1);
            for (int j=1;j<result.size()-1;j++){
                result.set(j,result.get(j)+result.get(j+1));
            }
        }
        return result;
    }
}
