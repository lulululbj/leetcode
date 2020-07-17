package leetcode._011_container_with_most_water;

/*
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 */
public class ContainerWithMostWater {

    /*
     * 暴力解法，双层循环
     * 时间复杂度：O(n^2)
     */
    public int solution(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) { // 注意两层的循环条件，保证 i ，j 不会是同一根柱子
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                max = Math.max(max, area);
            }
        }
        return max;
    }

    /*
     * 双指针法, 选定左右边界，将较矮边不断往里挪，直到两个指针相遇
     * 时间复杂度：O(n)
     */
    public int solution2(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            int area = (j - i + 1) * minHeight;
            max = Math.max(max, area);
        }
        return max;
    }
}
