# Binary Search

 `Easy`  `Binary Search`

## Description

Given a **sorted** (in ascending order) integer array `nums` of `n` elements and a `target` value, write a function to search `target` in `nums`. If `target` exists, then return its index, otherwise return `-1`.


**Example 1:**

```
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
```

**Example 2:**

```
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
```

 

**Note:**

1. You may assume that all elements in `nums` are unique.
2. `n` will be in the range `[1, 10000]`.
3. The value of each element in `nums` will be in the range `[-9999, 9999]`.

给定一个 `n` 个元素有序的（升序）整型数组 `nums` 和一个目标值 `target`  ，写一个函数搜索 `nums` 中的 `target`，如果目标值存在返回下标，否则返回 `-1`。

## Solution

典型的二分查找。

注意前提是有序数组。

确定首尾两个元素，头元素 `low` 下标为 `0`，尾元素 `hign` 下标为 `nums.length-1`，每次取中间值 `mid` 下标为 `low + (hign-low)>>2` 。比较  `target` 和 `nums[mid]`  的值：

* `target > nums[mid]` ,   取 `mid` 到 `high` 区间，即将 `low`  移至 `mid+1` 处
* `target < nums[mid]` ，取 `low` 到 `mid` 区间，即将 `hign`  移至 `mid-1` 处
* `target = nums[mid]` ，找到目标值，直接返回 `mid`

最后要注意的是循环的终结条件是 `low <= high`，需要考虑到 `nums` 数组中只有一个元素的情况。

Java 实现如下：

```java
 public int solution(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) { //  这里的判断条件是 <=，注意 nums=[5],target=5 的情况
            int mid = low + ((high - low) / 2);
            if (target > nums[mid]) low = mid + 1;
            else if (target < nums[mid]) high = mid - 1;
            else return mid;
        }
        return -1;
    }
```

