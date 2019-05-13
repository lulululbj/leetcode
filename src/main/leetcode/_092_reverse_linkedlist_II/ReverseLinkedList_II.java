package leetcode._092_reverse_linkedlist_II;

import leetcode.data.ListNode;

/*
    Reverse a linked list from position m to n. Do it in one-pass.

    Note: 1 ≤ m ≤ n ≤ length of list.

    Example:

    Input: 1->2->3->4->5->NULL, m = 2, n = 4
    Output: 1->4->3->2->5->NULL
 */

/**
 * Created by luyao
 * on 2019/5/13 9:22
 */
public class ReverseLinkedList_II {

    public ListNode solution(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;

        ListNode current = dummy;
        ListNode prev = null;
        int index = 0;
        while (current.next != null) {

            if (index == m - 1) prev = current;

            if (index >= m && index < n) { // 遍历至 m - n 位置时，将当前节点 cur 与 m 位置处的元素对调
                ListNode next = current.next;
                current.next = next.next;
                next.next = prev.next;
                prev.next = next;
            } else {
                current = current.next;
            }

            index++;
        }
        return dummy.next;
    }
}
