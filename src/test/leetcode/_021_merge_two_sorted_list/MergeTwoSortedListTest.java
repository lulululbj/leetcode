package leetcode._021_merge_two_sorted_list;

import leetcode.data.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeTwoSortedListTest {

    @Test
    public void solution() {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        ListNode node = mergeTwoSortedList.solution(l1, l2);

        assertEquals(1,node.val);
        assertEquals(1,node.next.val);
        assertEquals(2,node.next.next.val);
        assertEquals(3,node.next.next.next.val);
        assertEquals(4,node.next.next.next.next.val);
        assertEquals(4,node.next.next.next.next.next.val);
    }

}