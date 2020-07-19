package leetcode._019_remove_nth_node_from_end;

import leetcode.data.ListNode;

import java.util.List;

/*
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * Created by luyao
 * on 2019/5/9 10:40
 */
public class RemoveNthNodeFromEnd {

    /* 删除倒数第 n 个结点，即删除正数第 L-n+1 个结点，L为链表长度
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

    /*
     * 使用哨兵结点简化 solution1 中的边界判断条件(删除头结点的情况)
     */
    public ListNode solution2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }

        head = dummy;
        length = length - n;
        while (length > 0) {
            head = head.next;
            length--;
        }
        head.next = head.next.next;
        return dummy.next;
    }

    /*
     * 快慢指针法，两个指针开始都指向哨兵结点
     * 快指针先移动到 n 处，在同时移动快慢指针，直到快指针移到最后一个结点
     * 相比 solution2，只需要遍历一次
     */
    public ListNode solution3(ListNode head, int n) {
       ListNode dummy = new ListNode(0);
       dummy.next = head;
       ListNode fast = dummy;
       ListNode slow = dummy;
       for (int i = 0;i < n;i++){
           fast = fast.next;
       }
       while (fast.next != null){
           fast = fast.next;
           slow = slow.next;
       }
       slow.next = slow.next.next;
       return dummy.next;
    }
}
