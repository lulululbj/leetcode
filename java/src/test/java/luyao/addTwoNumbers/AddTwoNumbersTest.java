package luyao.addTwoNumbers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by luyao
 * on 2018/11/2 16:08
 */
public class AddTwoNumbersTest {

    @Test
    public void solution() {

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

        ListNode result = solution(node1, node4);

        System.out.println(result.val);
        System.out.println(result.next.val);
        System.out.println(result.next.next.val);
    }
}