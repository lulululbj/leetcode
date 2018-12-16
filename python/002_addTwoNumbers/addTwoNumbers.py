# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        result = ListNode(0)
        head = result

        carry = 0
        add = 0
        while l1 or l2:
            if l1:
                add += l1.val
                l1 = l1.next

            if l2:
                add += l2.val
                l2 = l2.next

            carry, add = divmod(add, 10)
            result.next = ListNode(add)
            result = result.next
            add = carry

        if carry > 0:
            result.next = ListNode(carry)

        return head.next


if __name__ == '__main__':
    l1 = ListNode(2)
    l1.next = ListNode(4)
    l1.next.next = ListNode(3)

    l2 = ListNode(5)
    l2.next = ListNode(6)
    l2.next.next = ListNode(4)

    result = Solution().addTwoNumbers(l1, l2)

    print(result.val)
    print(result.next.val)
    print(result.next.next.val)
