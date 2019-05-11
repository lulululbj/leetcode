# 2. Add Two numbers

`Medium`

`Linked List` `Math`

## Description

You are given two **non-empty** linked lists representing two non-negative integers. The digits are stored in **reverse order** and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

**Example:**

```
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```

给定两个**非空**链表来表示两个非负整数。位数按照**逆序**方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。

你可以假设除了数字 0 之外，这两个数字都不会以零开头。

## Solution

对两条链表的每个节点依次相加，注意进位。其实可以理解为加法运算，题中的例子就是计算 `342 + 465 = 807`。第一遍写的时候可能会忽略一些特殊情况，我在第一遍写的时候就没有考虑到 `5 + 5 = 10`这一情况。下面罗列一下需要注意的一些点：

* 两条链表长度不一致的情况
* 计算到链表中最后一个节点时仍然存在进位的情况，例如上面说过的 `5 + 5`

```java
public static ListNode solution(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(0);
    ListNode head = result;
    int sum = 0, carry = 0;
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
```

开头定义了一个 `head` 节点指向最后的结果，方便取出结果。`sum` 存储各个节点相加的值，并取出个位上的值，即 `sum%10`。`carry` 存储进位值，即 `sum/10`。最后需要注意的是，遍历完链表之后如果仍然存在进位，需要再添加一个节点，节点值为进位值。

* 时间复杂度：O(n)，仅与链表长度有关
* 空间复杂度：O(n)，同样也仅与链表长度有关
