# 92. Reverse Linked List II

`Medium`  

`Linked List`

## Description

Reverse a linked list from position m to n. Do it in one-pass.

**Note:** 1 ≤ m ≤ n ≤ length of list.

**Example:**

```
Input: 1->2->3->4->5->NULL, m = 2, n = 4
Output: 1->4->3->2->5->NULL
```

反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。

## Solution

虽然是反转链表二，但是和反转链表一的思路是不一样的。一个是反转整个链表，把每个结点指向前一个结点即可。另一个是反转链表中的一小截，`m` 到 `n` 位置。最重要的是理清楚思路再下手写代码。链表的前 `m` 个结点和 `n` 位置之后的结点是不需要处理的，我们只需要遍历 m 到 n 之间的结点。每迭代一个结点，就把该结点插入到 m 位置，一直迭代到位置 n 处，就完成了反转过程。这样可能还是不太好理解，下面以题目中的 `1->2->3->4->5->NULL, m = 2, n = 4` 为例，逐步分析。

```
1     ->      2     ->      3     ->      4     ->      5     -> NULL
prev        current       next
```

先说说这几个结点的含义：

* prev : 一个固定节点，每迭代一个元素要做的操作就是将 next 结点插入到 prev 之后
* current ：迭代的当前节点
* next : 当前结点的下一个结点，就是要插入到 prev 之后的结点

第一步，先将 `3` 插入到 `1` 之后，也就是将 next 插入到 prev 之后，得到：

```
1     ->      3     ->      2     ->      4     ->      5     -> NULL
prev                      current        next
```

第二步，将 `next = 4` 插入到 prev 之后，得到：

```
1     ->      4     ->      3     ->      2     ->      5     -> NULL
prev                                    current        next
```

current 已经到达位置 n 处，结束遍历。此时已经完成了该段链表的反转。要注意的是，每次的操作是将 `next` 插入到 `prev` 之后，并不是和 `prev` 之后的结点交换。那么如何完成插入呢，就是下面四句核心代码：

```java
ListNode next = current.next;
current.next = next.next; // current 指向 next 后面的结点
next.next = prev.next; // next 指向 prev 后面的结点
prev.next = next; // prev 指向 next
```

光看代码很抽象，自己动笔画一画就一目了然了。最后还要考虑只有两个结点的特殊情况，还是通过哨兵结点来解决问题。完整代码如下：

```java
public ListNode solution(ListNode head, int m, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next=head;

    ListNode current = dummy;
    ListNode prev = null;
    int index = 0;
    while (current.next != null) {

        if (index == m - 1) prev = current; // prev 全程保持不动， next 永远插在 prev 后面

        if (index >= m && index < n) {
            ListNode next = current.next;
            current.next = next.next;
            next.next = prev.next;
            prev.next = next;
        } else {
            current = current.next;
        }

        index++;
    }
    return dummy.next;
}
```
