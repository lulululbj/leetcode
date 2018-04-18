package luyao._002;

/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their   * nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

import luyao.data.ListNode;

/**
 * Created by luyao
 * on 2018/4/18 16:44
 */
public class AddTwoNumbers {

    public static ListNode solution(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int sum = 0;
        while (l1 != null || l2 != null) {
            sum /= 10;
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
        }
        if (sum / 10 == 1) result.next = new ListNode(1);

        return result.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);

        node4.next = node5;
        node5.next = node6;

        ListNode result=solution(node1,node4);

    }
}
