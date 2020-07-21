package leetcode._155_min_stack;

/*
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/min-stack
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 示例:
 *
 * 输入：
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 *
 * 输出：
 * [null,null,null,null,-3,null,0,-2]
 *
 * 解释：
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 */

import org.omg.CORBA.INTERNAL;

import java.util.Stack;

/*
 * 利用辅助栈，数据栈每次存入数据时，都在辅助栈中存入当前数据栈的最小值
 * 数据栈和辅助栈同步插入和删除
 */
public class MinStack {

    private Stack<Integer> dataStack;
    private Stack<Integer> helpStack;

    public MinStack() {
        dataStack = new Stack<>();
        helpStack = new Stack<>();
    }

    public void push(int x) {
        dataStack.push(x);
        if (helpStack.isEmpty()){
            helpStack.add(x);
        }else if (helpStack.peek() <= x){
            helpStack.push(helpStack.peek());
        }else {
            helpStack.push(x);
        }
    }

    public void pop() {
        dataStack.pop();
        helpStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return helpStack.peek();
    }

}
