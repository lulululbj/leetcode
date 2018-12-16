# Given an array of integers, return indices of the two numbers such that they add up to a specific target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.
# Example:
# Given nums = [2, 7, 11, 15], target = 9,
# Because nums[0] + nums[1] = 2 + 7 = 9,
# return [0, 1].

class Solution(object):

    def twoSum(nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        result = {}

        for i, num in enumerate(nums):
            if target - num in result:
                return [result[target - num], i]
            else:
                result[num] = i


if __name__ == '__main__':
    _nums = [2, 11, 7, 15]
    _target = 9
    print(Solution.twoSum(_nums, _target))
