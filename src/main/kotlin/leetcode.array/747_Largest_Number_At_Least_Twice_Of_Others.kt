package leetcode.array

/**https:leetcode.com/problems/largest-number-at-least-twice-of-others/
747. Largest Number At Least Twice of Others
You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.



Example 1:

Input: nums = [3,6,1,0]
Output: 1
Explanation: 6 is the largest integer.
For every other number in the array x, 6 is at least twice as big as x.
The index of value 6 is 1, so we return 1.
Example 2:

Input: nums = [1,2,3,4]
Output: -1
Explanation: 4 is less than twice the value of 3, so we return -1.
Example 3:

Input: nums = [1]
Output: 0
Explanation: 1 is trivially at least twice the value as any other number because there are no other numbers.


Constraints:

1 <= nums.length <= 50
0 <= nums[i] <= 100
The largest element in nums is unique.**/
class `747_Largest_Number_At_Least_Twice_Of_Others` {

    fun solution(nums: IntArray): Int {
        var n = nums.size
        if (n == 1) {
            return 0
        }
        var max = Integer.MIN_VALUE
        var maxPos = -1

        for (i in nums.indices) {
            if (max < nums[i]) {
                max = nums[i]
                maxPos = i
            }
        }

        for (i in nums.indices) {
            if (i != maxPos && nums[i] * 2 > max) {
                return -1
            }
        }

        return maxPos
    }
}