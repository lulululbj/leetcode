# 21. Merge Two Sorted Lists

`Easy`  

`Linked List`

## Description

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

**Example:**

```
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
```

将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

## Solution

其实就按人脑的思维来写这个算法就可以了。就拿上面的例子，`1->2->4` 和 `1->3->4`。注意前提是有序链表。

* 首先比较第一位都是 1，就输入 `1->1`。
* 接着比较第二个结点，`2<3`,所以先把 2 接上，变成 `1->1->2`。3 不能直接拼上去，因为你不知道 3 和 l1 链表中的下一个结点谁大。
* 接着比较 l1 的第三个结点和 l2 的第二个结点，`3<4`，把 3 拼上，得到 `1->1->2->3`
* 就这样一直比较到其中一条链表为空，就直接把另一条链表的剩余部分直接拼接到之前的结果后面。

说的有点乱，可能还没有直接看代码来的直接：

```java
public ListNode solution(ListNode l1, ListNode l2) {

       ListNode dummy = new ListNode(0);
       ListNode node = dummy;
       while (l1 != null && l2 != null) {
           if (l1.val > l2.val) {
               node.next = l2;
               l2 = l2.next;
           } else {
               node.next = l1;
               l1 = l1.next;
           }
           node = node.next;

       }

       if (l1!=null) node.next=l1;
       if (l2!=null) node.next=l2;

       return dummy.next;
   }
```

这里使用了一个哨兵结点 node 来简化边界情况以及保存头结点的引用。时间复杂度为 `O(n)`，仅仅循环一轮。空间复杂度是 `O(1)` 。
