package leetcode._092_reverse_linkedlist_II;

import leetcode.data.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by luyao
 * on 2019/5/13 9:46
 */
public class ReverseLinkedList_IITest {

    @Test
    public void test() {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = new ReverseLinkedList_II().solution(head, 2, 4);
        assertEquals(1,result.val);
        assertEquals(4,result.next.val);
        assertEquals(3,result.next.next.val);
        assertEquals(2,result.next.next.next.val);
        assertEquals(5,result.next.next.next.next.val);

        ListNode head2 = new ListNode(3);
        head2.next = new ListNode(5);
        ListNode result2 = new ReverseLinkedList_II().solution(head2, 1, 2);
        assertEquals(5,result2.val);
        assertEquals(3,result2.next.val);
    }

}