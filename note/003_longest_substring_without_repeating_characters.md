# 3. Longest Substring Without Repeating Characters

`Medium`  

`Hash Table`  `Two Pointers`  `String`

## Description

Given a string, find the length of the **longest substring** without repeating characters.

**Example 1:**

```
Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```

**Example 2:**

```
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

**Example 3:**

```
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

给定一个字符串，请你找出其中不含有重复字符的 **最长子串** 的长度。

## Solution

### 方案1
暴力查找。两层循环，使用一个 `Set` 保存不重复子串。迭代过程中，遇到不重复字符，加入容器，遇到重复字符，直接清空容器。如此往复迭代所有子字符串即可获得最长子串长度。提交了好几个版本才通过所有测试，虽然还是超时了。记录几个注意的问题：

* 注意输入为 `""` 的情况
* 第二层迭代至最后一个元素，即  `j == s.length()-1` 时，要清空容器，否则会出现最后一个字符后面跟着第一个字符的子串

```java
public int solution1(String s) {
        if (s.equals("")) return 0;
        Set<Character> subString = new HashSet<>();
        int maxLength = 1, length = 1; // 最小为 1
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                Character ss = s.charAt(j);
                if (subString.contains(ss)) {
                    maxLength = Math.max(subString.size(), maxLength);
                    subString.clear();
                } else {
                    subString.add(ss);
                }
                length = subString.size();
                // 每一轮结束要清空 subString，因为要连续子串
                if (j == s.length() - 1) subString.clear();
            }
            maxLength = Math.max(maxLength, length);

        }
        return maxLength;
    }
```

* 时间复杂度：O(n^2)，两层迭代，超时
* 空间复杂度：O(n)

### 方案2
捋一捋思路，就拿示例中的 `abcabcbb` 字符串来说，按我们正常的思路去找最长不重复子串，应该是下面这样一个思路：

1. 从第一个字符开始，读取 `a` , 加入 `substring`，此时 `maxLength ` 为 `1`
2. 读取第二个字符 `b`，加入子串，此时 `subString` 为  `ab`，`maxLength` 为 `2`
3. 读取第三个字符 `c`，同步骤 2。此时 `subString` 为  `abc`，`maxLength` 为 `3`
4. 读取第四个字符 `a`，此时遇到了重复字符`a`，抛弃子串中的第一个 `a`，更新子串为 `bca`，`maxLength ` 仍未 `3`
5. 读取第五个字符 `b`,同步骤4，更新子串为 `cab`，`maxLength ` 仍未 `3`
6. 读取第六个字符 `c`,同步骤5，更新子串为 `abc`，`maxLength ` 仍未 `3`
7. 读取第七个字符 `b`，这时得抛弃子串中的 `ab`，再加入读取的`b`，才能保证子串不重复。此时子串为 `cb`，长度只有 2，不是最大值，不更新 `maxLength`
8. 读取最后一个字符 `b`，子串为 `cb`，只有全部抛弃，才能加入最后一个字符。此时子串为 `b`，长度只有 1，不是最大值，不更新 `maxLength`。最后得 `maxLength` 为 3。

上面的思路好像更符合实际，显然时间复杂度只有 `O(n) `。仔细比较一下这两个算法，其实思路都是一致的，只是算法一做了很多重复的工作。想象有两个指针分别指向不重复子串的首尾，初始都指向 `0`。我们逐位向右移动尾指针，当碰到重复字符时，算法一的处理是清空子串，将尾指针移到头指针的位置再重新进行迭代，头指针也是逐位往右移动的。而算法二的处理是遇到重复字符保持尾指针不动，向右移动头指针以保证子串不重复。那么为了保证头指针知道往哪移动，算法二在移动尾指针的同时，使用了一个哈希表记录每个字符出现的最大下标，这样，头指针就知道该怎么移动才能抛弃掉重复字符了。这里要注意的是，头指针不能往回移动，如果找到的下标比当前位置还小，那就不能移动了。

```java
 public int solution2(String s) {
        int maxLength = 0;
        HashMap<Character, Integer> subString = new HashMap<>();
        for (int i = 0, j = 0; j < s.length(); j++) {
            if (subString.containsKey(s.charAt(j))) {
                i = Math.max(subString.get(s.charAt(j)),i); // 头指针不能往回移动
            }
            subString.put(s.charAt(j), j + 1);
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
```

* 时间复杂度：O(n)
* 空间复杂度：O(n)
