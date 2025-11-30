class Solution:
    def minSubarray(self, nums, p):
        total = sum(nums)
        rem = total % p
        if rem == 0:
            return 0

        prefix = 0
        best = len(nums)
        seen = {0: -1}  # prefix mod 0 at index -1

        for i, x in enumerate(nums):
            prefix = (prefix + x) % p
            target = (prefix - rem) % p

            if target in seen:
                best = min(best, i - seen[target])

            seen[prefix] = i

        return best if best < len(nums) else -1
