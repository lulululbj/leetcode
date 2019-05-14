package leetcode._141_linkedlist_cycle;

import leetcode.data.ListNode;

import java.util.HashSet;
import java.util.Set;

/*
 * 判断链表是否有环，要求 O(1) 空间复杂度
 */

/**
 * Created by luyao
 * on 2019/5/14 16:20
 */
public class LinkedListCycle {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public boolean solution1(ListNode head) {

        Set<ListNode> result = new HashSet<>();

        while (head != null) {
            if (result.contains(head))
                return true;
            else
                result.add(head);

            head = head.next;
        }

        return false;
    }


    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public boolean solution2(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy.next;

        for (; ; ) {
            if (fast == null || fast.next == null)
                return false;

            if (slow == fast)
                return true;

            slow = slow.next;
            fast = fast.next.next;

        }
    }
}
