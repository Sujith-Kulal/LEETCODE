class Solution:
    def twoSum(self, nums, target):
        # Use hash map to eliminate nested loop duplication
        seen = {}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in seen:
                return [seen[complement], i]
            seen[num] = i

        