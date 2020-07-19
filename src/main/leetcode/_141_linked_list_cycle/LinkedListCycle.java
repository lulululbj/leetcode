package leetcode._141_linked_list_cycle;

import leetcode.data.ListNode;

/*
 * 给定一个链表，判断链表中是否有环。
 *
为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 * 示例 1：
 *
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 * 示例 2：
 *
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 *
 * 示例 3：
 *
 * 输入：head = [1], pos = -1
 * 输出：false
 * 解释：链表中没有环。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/linked-list-cycle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LinkedListCycle {

    /*
     * 快慢指针，初始下快指针领先慢指针一步，慢指针每次向右移动一步，快指针每次向右移动两步
     * 如果链表无环，快指针会先到达终点
     * 如果链表有环，最终两个指针一定会相遇
     * 时间复杂度: O(n)
     * 空间复杂度: O(1)
     */
    public boolean hasCycle(ListNode head){
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
