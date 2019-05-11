package leetcode._021_merge_two_sorted_list;

//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
//
//        Example:
//
//        Input: 1->2->4, 1->3->4
//        Output: 1->1->2->3->4->4

import leetcode.data.ListNode;

public class MergeTwoSortedList {


    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public ListNode solution(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode node = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                node.next = l2;
                l2 = l2.next;

            } else {
                node.next = l1;
                l1 = l1.next;
            }
            node = node.next;

        }

        if (l1!=null) node.next=l1;
        if (l2!=null) node.next=l2;

        return head.next;
    }
}
