package leetcode.binary_search

class Search_In_Rotated_Sorted_Array {

    fun solution(nums: IntArray, target: Int): Int {
        val n: Int = nums.size
        val pivot: Int = findPivot(nums) //O(N)

        if (pivot == -1) {
            return binarySearch(target, nums, 0, n - 1)
        }

        if (nums[pivot] == target) return pivot

        val leftSearch: Int = binarySearch(target, nums, 0, pivot - 1) //logn

        val rightSearch: Int = binarySearch(target, nums, pivot, n - 1) //logn


        return if (leftSearch == -1) {
            rightSearch
        } else {
            leftSearch
        }
    }

    fun binarySearch(target: Int, nums: IntArray, left: Int, right: Int): Int {
        var left = left
        var right = right
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return -1
    }

    fun findPivot(nums: IntArray): Int {
        val n = nums.size
        var left = 0
        var right = n - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (mid - 1 >= 0 && nums[mid] < nums[mid - 1]) {
                return mid
            }
            if (left - 1 >= 0 && nums[left] < nums[left - 1]) {
                return left
            }
            if (right - 1 >= 0 && nums[right] < nums[right - 1]) {
                return right
            }
            if (nums[left] < nums[mid]) {
                left = mid + 1
            } else if (nums[mid] < nums[right]) {
                right = mid - 1
            } else {
                return mid
            }
        }
        return -1
    }
}