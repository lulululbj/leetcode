package leetcode._155_min_stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {

    @Test
    public void minStack(){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3,minStack.getMin());
        minStack.pop();
        assertEquals(0,minStack.top());
        assertEquals(-2,minStack.getMin());

        MinStack2 minStack2 = new MinStack2();
        minStack2.push(-2);
        minStack2.push(0);
        minStack2.push(-3);
        assertEquals(-3,minStack2.getMin());
        minStack2.pop();
        assertEquals(0,minStack2.top());
        assertEquals(-2,minStack2.getMin());
    }

}
