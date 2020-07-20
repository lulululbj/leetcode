package leetcode._876_middle_of_linked_list;

import leetcode.data.ListNode;

public class MiddleOfLinkedList {

    /*
     * 快慢指针，慢指针每次移动一步，快指针每次移动两步
     */
    public ListNode solution(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return fast.next == null ? slow : slow.next;
    }
}
