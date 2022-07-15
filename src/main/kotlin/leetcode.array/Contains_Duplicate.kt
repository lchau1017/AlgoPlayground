package leetcode.array

class Contains_Duplicate {

    fun solution(nums: IntArray): Boolean {

        if (nums.size <= 1) {
            return false
        }
        val seen = mutableSetOf<Int>()
        var left = 0
        var right = nums.size - 1

        while (left < right) {

            if (seen.contains(nums[left]) || seen.contains(nums[right]) || nums[left] == nums[right]) {
                return true
            } else {
                seen.add(nums[left])
                seen.add(nums[right])
                left++
                right--
            }

        }

        if (nums.size % 2 != 0) {
            return seen.contains(nums[left++])
        }

        return false
    }
}