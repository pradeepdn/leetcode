class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        left = 0
        sum_ = 0
        result = sys.maxsize

        for right in range(0, len(nums), 1):
            sum_ += nums[right]

            while sum_ >= target:
                result = min(result, (right - left + 1))
                sum_ -= nums[left]
                left += 1
        return 0 if result == sys.maxsize else result
