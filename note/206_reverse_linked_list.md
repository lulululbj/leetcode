# 206. Reverse Linked List

`Easy`  

`Array`  `Linked List`

## Description

Reverse a singly linked list.

**Example:**

```
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
```

**Follow up:**

A linked list can be reversed either iteratively or recursively. Could you implement both?

反转一个单链表。

你可以迭代或递归地反转链表。你能否用两种方法解决这道题？


## Solution

### 迭代

反转单链表，思路很简单。迭代整个链表，把每个结点的后继指针指向前一个结点就可以了。其实很多算法都是这样，在人脑的思维看来很简单，难的是如何准确的用代码表达出来。

```java
public ListNode solution(ListNode head) {

     ListNode current = head;
     ListNode prev = null;

     while (current != null) {
         ListNode next = current.next;
         current.next = prev;
         prev = current;
         current = next;
     }
     return prev;
 }
```

`current` 表示当前结点，`prev` 表示当前结点的前一个结点，`next` 表示当前结点的后一个结点。每次迭代中做这样两件事：

* 将 `current` 的后继指针指向 `prev`
* 将 `current` 和 `prev` 向后更新

用表格罗列一下迭代过程：

| null | 1 | 2 | 3 | 4 | 5 | null |
| :--: | :--: | :--: | :--: | :--: | :--: | :--: |
| prev | current | next | | | | |
| |  prev | current | next | | | |
| | | prev | current | next | | |
| | | | prev | current | next | |
| | | | | prev | current | next |
| | | | | | prev | current |

最后 `prev` 就是 `5 -> 4 -> 3 -> 2 -> 1 -> null` 了。

迭代一次，时间复杂度是 `O(n)`，空间复杂度是 `O(1)`。

### 递归

递归的思路和迭代其实是一样的，本质还是把每个结点的后继指针指向前一个结点就可以了。

```java
public ListNode solution2(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode node = solution2(head.next);
    head.next.next = head;
    head.next = null;
    return node;
}
```

递归解法的时间复杂度仍然是 `O(n)`，空间复杂度不再是 `O(1)`。由于递归存在的栈调用，一共是 n 层，所以空间复杂度也是 `O(n)`。
