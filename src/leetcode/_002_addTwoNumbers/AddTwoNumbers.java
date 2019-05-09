package leetcode._002_addTwoNumbers;

/*
 *   You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their
 *   nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 *
 *   You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 *   Example:
 *
 *   Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *   Output: 7 -> 0 -> 8
 *   Explanation: 342 + 465 = 807.
 */

import leetcode.data.ListNode;

/**
 * Created by luyao
 * on 2018/11/2 9:23
 */
public class AddTwoNumbers {

    public static ListNode solution(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        int sum = 0, carry=0;
        while (l1 != null || l2 != null) {

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            result.next = new ListNode(sum % 10);
            result = result.next;
            carry = sum / 10;
            sum = carry;
        }
        if (carry>0) result.next=new ListNode(carry);
        return head.next;
    }

}
