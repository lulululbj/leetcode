package leetcode._141_linkedlist_cycle;

import leetcode.data.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by luyao
 * on 2019/5/14 16:28
 */
public class LinkedListCycleTest {

    @Test
    public void solution() {

        ListNode head = new ListNode(1);
        ListNode next = new ListNode(2);
        head.next = next;
        next.next = new ListNode(3);
        next.next = new ListNode(4);
        ListNode tail = new ListNode(5);
        next.next.next = tail;
        tail.next = next;


        assertTrue(new LinkedListCycle().solution2(head));
    }
}