# Remove Nth Node From End of List

`Linked List`  `Two Pointers`

## Description

Given a linked list, remove the n-th node from the end of list and return its head.

**Example:**

> Given linked list: **1->2->3->4->5**, and **n = 2**.
>
> After removing the second node from the end, the linked list becomes **1->2->3->5**.

**Note:**

Given n will always be valid.


给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

## Solution

假定链表长度为 `length`，删除链表的倒数第 `n` 个结点，等同于删除链表的第 `length-n+1` 个结点。所以这里需要两次遍历。第一次遍历获取链表的长度，第二次遍历再去删除 length-n+1 处的结点。代码如下：

```java
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
```

代码写的比较冗余，因为要处理删除头结点的情况。看了别人的 Solution 之后发现可以引入哨兵结点来简化边界情况的处理。即添加一个空结点来指向原来的头结点，就不需要处理边界情况了。代码如下：

```java
public ListNode solution2(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    int length = 0;
    while (head != null) {
        length++;
        head = head.next;
    }

    head = dummy;
    length = length - n;
    while (length > 0) {
        length--;
        head = head.next;
    }
    head.next = head.next.next;

    return dummy.next;
}
```

上面的两种解法时间复杂度都是 `O(n)`，空间复杂度是 `O(1)`。使用快慢指针可以进一步优化，只需进行一次循环。首先将快指针指向第 n 个结点，慢指针指向哨兵结点，然后同时逐个结点往右移动快慢指针，这时候快慢指针之间始终相差 n 个结点。当快指针指向尾节点时，慢指针指向倒数第 n+1 个结点，这是就可以删除倒数第 n 个结点了。和滑动窗口的思路是一致的。具体代码如下：

```java
public ListNode solution3(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next=head;
    ListNode fast=dummy;
    ListNode slow=dummy;
    for (int i=0;i<n;i++){
        fast=fast.next;
    }

    while (fast.next!=null){
        fast=fast.next;
        slow=slow.next;
    }

    slow.next=slow.next.next;
    return dummy.next;
}
```
