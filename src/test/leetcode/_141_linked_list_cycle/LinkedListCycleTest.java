package leetcode._141_linked_list_cycle;

import leetcode.data.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycleTest {

    ListNode head = new ListNode(3);
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(0);
    ListNode node3 = new ListNode(-4);

    @Before
    public void setUp(){
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
    }

    @Test
    public void hasCycle() {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        boolean isCycle = linkedListCycle.hasCycle(head);
        assertTrue(isCycle);
    }
}