package _002_addTwoNumbers;

import leetcode._002_addTwoNumbers.AddTwoNumbers;
import leetcode.data.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    @Test
    public void solution() {

        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);

        node4.next = node5;
        node5.next = node6;

        ListNode result = AddTwoNumbers.solution(node1, node4);

        assertEquals(7,result.val);
        assertEquals(0,result.next.val);
        assertEquals(8,result.next.next.val);

        ListNode node7=new ListNode(5);
        ListNode node8=new ListNode(5);
        ListNode result2=AddTwoNumbers.solution(node7,node8);
        assertEquals(0,result2.val);
        assertEquals(1,result2.next.val);
    }
}