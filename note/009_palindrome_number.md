# Palindrome Number (回文数)

`Easy`  

`Math`

## Description

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

**Example 1:**

```
Input: 121
Output: true
```

**Example 2:**

```
Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```

**Example 3:**

```
Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```

**Follow up:**

Coud you solve it without converting the integer to a string?

判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

## Solution

### 方案1

第一想法，转成 `String` 之后判断是否是回文字符串。
两个指针一个指向头字符，一个指向尾字符，同时向中间移动，逐个字符比较，直到两个指针相遇。

```java
public boolean isPalindrome(int x) {
    String src = String.valueOf(x);
    int a = 0;
    int b = src.length() - 1;

    while (a < b) {
        if (src.charAt(a) != src.charAt(b)) {
            return false;
        }
        a++;
        b--;
    }
    return true;
}
```

* 时间复杂度：O(n)，指针移动次数仅与数字长度有关
* 空间复杂度：O(n)，需要额外的字符串对象

### 方案2

不转成字符串，但是和方案 1 比较回文字符串的思路一致，比较首尾数字是否相等。
通过除法得到首位数字，通过 `%10` 得到末尾数字。

```java
public boolean isPalindrome2(int x) {
    if (x < 0) return false;
    int div = 1;
    while (x / div >= 10) div *= 10;

    while (x > 0) {
        int a = x / div;
        int b = x % 10;
        if (a != b) return false;
        x = (x % div) / 10;
        div /= 100;
    }
    return true;
}
```

* 时间复杂度：O(logN)，每次迭代中都除以 10，所以是 O(logN)。注意的是，上面进行了两次循环，后面还可以优化。
* 空间复杂度：O(1)

### 方案3

来自官方 Solution 的解法。核心思路为反转后半部分数字。

每次取出数字 x 的最后一位，拼接为数字 right。直到 x 不大于 right 时，完成右半部分数字的反转。

如果原回文数字长度为偶数，则应该 x == right。
如果原回文数字长度为奇数，则应该 x == right/10。

以数字 `12321` 简单示例：

| x |  right |
| --- |--- |
|  12321 | 0 |
|  1232 | 1 |
|  123 | 12 |
|  12 | 123 |

原数字为奇数，此时满足 `12 == 123/10`，`12321` 为回文数。

* 时间复杂度：O(logN)，比方案一少了一次循环
* 空间复杂度：O(1)