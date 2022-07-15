package leetcode.array

class Minimum_Size_Subarray_Sum {
    fun solution(target: Int, nums: IntArray): Int {
        var left = 0
        var right = 0
        var minLen = Int.MAX_VALUE
        var sum = nums[left]

        while (right < nums.size - 1) {

            sum += nums[right]

            while (sum >= target) {
                minLen = minOf((right - left) + 1, minLen)
                sum -= nums[left++]
            }
            right++
        }

        return if (minLen == Int.MAX_VALUE) 0 else minLen

    }

    fun fasterSolution(target: Int, nums: IntArray): Int {
        var l = 0
        var res = nums.size + 1;
        var curr = 0
        for (i in nums.indices) {
            curr += nums[i]
            if (curr < target) {
                continue
            }
            while (curr >= target) {
                curr -= nums[l++]
            }
            curr += nums[--l]
            res = minOf(res, i - l + 1)
        }
        return if (res == nums.size + 1) 0 else res
    }
}