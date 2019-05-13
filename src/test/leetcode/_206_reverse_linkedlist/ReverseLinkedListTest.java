package leetcode._206_reverse_linkedlist;

import leetcode.data.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    @Test
    public void test(){

        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        ListNode head2=new ListNode(1);
        head2.next=new ListNode(2);
        head2.next.next=new ListNode(3);
        head2.next.next.next=new ListNode(4);
        head2.next.next.next.next=new ListNode(5);

        ReverseLinkedList reverseLinkedList=new ReverseLinkedList();
        ListNode result = reverseLinkedList.solution(head);
        ListNode result2 = reverseLinkedList.solution2(head2);

        check(result);
        check(result2);

    }

    private void check(ListNode result){
        assertEquals(5,result.val);
        assertEquals(4,result.next.val);
        assertEquals(3,result.next.next.val);
        assertEquals(2,result.next.next.next.val);
        assertEquals(1,result.next.next.next.next.val);
    }

}