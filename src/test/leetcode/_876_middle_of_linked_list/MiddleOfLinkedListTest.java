package leetcode._876_middle_of_linked_list;

import leetcode.data.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleOfLinkedListTest {

    ListNode head = new ListNode(1);
    ListNode two = new ListNode(2);
    ListNode three = new ListNode(3);
    ListNode four = new ListNode(4);
    ListNode five = new ListNode(5);

    @Before
    public void setUp() throws Exception {
        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
    }

    @Test
    public void solution() {
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        ListNode result = middleOfLinkedList.solution(head);
        assertEquals(3,result.val);
        assertEquals(4,result.next.val);
        assertEquals(5,result.next.next.val);

        four.next = null;
        ListNode result2 = middleOfLinkedList.solution(head);
        assertEquals(3,result2.val);
        assertEquals(4,result2.next.val);
    }
}