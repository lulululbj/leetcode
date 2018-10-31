# Two Sum

`Easy`  `Array`  `Hash Table`

## Description

Given an array of integers, return **indices** of the two numbers such that they add up to a specific target.

You may assume that each input would have **exactly** one solution, and you may not use the *same* element twice.

**Example:**

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

给定一个整数数组和一个目标值，找出数组中和为目标值的**两个**数。

你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

## Solution

### 方案1
下意识的解决方案，遍历数组中每一个元素 x，并寻找数组中是否存在 target-x 。

```java
public int[] solution(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target)
                return new int[]{i, j};
        }
    }
    return null;
}
```

* 时间复杂度：O(n^2)，对于每一个元素，都会对数组中剩余部分进行遍历以寻找 target-x ，显然，时间复杂度为 O(n^2)
* 空间复杂度：O(1)

### 方案2
查找元素，我们很自然的会想到哈希表，哈希表的查找时间几乎恒定为 O(1)。在哈希表中以索引为值，索引处的值为键进行存储，只需要一次遍历，对于每一个元素 x，判断哈希表中是否 `containsKey(target-x)`，不存在则将该元素塞入哈希表，若存在直接返回该元素和对应的 target-x。

```java
public int[] solution2(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i]))
            return new int[]{i, map.get(target - nums[i])};
        map.put(nums[i], i);
    }
    return null;
}
```

* 时间复杂度：O(n)，只需一次遍历，且查找时间为 O(1)
* 空间复杂度：O(n)，需要的额外空间为一个哈希表，至多存储 n 个元素

方案2 就是典型的空间换时间，在对空间限制不大的情况下，将大大提升算法的效率。
