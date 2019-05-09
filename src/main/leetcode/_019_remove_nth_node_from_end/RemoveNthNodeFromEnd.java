package leetcode._019_remove_nth_node_from_end;

import leetcode.data.ListNode;

/*
    Given a linked list, remove the n-th node from the end of list and return its head.

    Example:

    Given linked list: 1->2->3->4->5, and n = 2.

    After removing the second node from the end, the linked list becomes 1->2->3->5.
*/

/**
 * Created by luyao
 * on 2019/5/9 10:40
 */
public class RemoveNthNodeFromEnd {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public ListNode solution1(ListNode head, int n) {

        int length = 1;
        ListNode next = head.next;
        while (next != null) { // 第一次遍历获取链表长度
            length++;
            next = next.next;
        }

        next = head;
        ListNode prev = null;
        int index = length - n + 1;

        if (index == 1) { // 删除头结点
            if (head.next == null) {
                head = null;
                return null;
            } else {
                head = head.next;
                return head;
            }
        }

        for (int i = 1; i < length + 1; i++) { // 第二次遍历删除 length-n+1 处结点
            if (i == index - 1) {
                prev = next;
            }
            next = next.next;
        }

        prev.next = prev.next.next;
        return head;
    }

    /**
     * 使用哨兵结点简化边界条件
     */
    public ListNode solution2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }

        head = dummy;
        length = length - n;
        while (length > 0) {
            length--;
            head = head.next;
        }
        head.next = head.next.next;

        return dummy.next;
    }

    /**
     * 快慢指针
     */
    public ListNode solution3(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        for (int i=0;i<n;i++){
            fast=fast.next;
        }

        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;
        return dummy.next;
    }
}
