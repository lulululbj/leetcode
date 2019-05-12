package leetcode._206_reverse_linkedlist;

import leetcode.data.ListNode;

/*
    Reverse a singly linked list.

    Example:

    Input: 1->2->3->4->5->NULL
    Output: 5->4->3->2->1->NULL
 */

public class ReverseLinkedList {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public ListNode solution(ListNode head) {

        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


    public ListNode solution2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = solution2(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
