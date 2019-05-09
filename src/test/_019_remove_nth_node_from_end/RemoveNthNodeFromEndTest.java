package _019_remove_nth_node_from_end;

import leetcode._019_remove_nth_node_from_end.RemoveNthNodeFromEnd;
import leetcode.data.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by luyao
 * on 2019/5/9 10:56
 */
public class RemoveNthNodeFromEndTest {


    @Test
    public void solution() {

        RemoveNthNodeFromEnd removeNthNodeFromEnd = new RemoveNthNodeFromEnd();

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        ListNode head=removeNthNodeFromEnd.solution3(one,2);
        assertEquals(1,head.val);
        assertEquals(2,head.next.val);
        assertEquals(3,head.next.next.val);
        assertEquals(5,head.next.next.next.val);

        ListNode _one = new ListNode(1);
        ListNode _two = new ListNode(2);
        _one.next=_two;
        ListNode _head=removeNthNodeFromEnd.solution3(_one,2);
        assertEquals(2,_head.val);
    }
}