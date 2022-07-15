package leetcode.array

class Merge_Sorted_Array {

    fun solution(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray? {


        if (m == 0) {
            for (i in nums2.indices) {
                nums1[i] = nums2[i]
            }
            return nums1
        }

        var i = m - 1
        var j = n - 1
        var right = m + n - 1

        while (right >= 0) {

            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[right] = nums1[i]
                i--
            } else {
                nums1[right] = nums2[j]
                j--
            }

            right--
        }

        return nums1
    }

    //leetcode soultion
//    fun solution(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray? {
//        // Set p1 and p2 to point to the end of their respective arrays.
//        var p1: Int = m - 1
//        var p2: Int = n - 1
//
//        // And move p backwards through the array, each time writing
//        // the smallest value pointed at by p1 or p2.
//
//        for (p in m + n - 1 downTo 0) {
//            if (p2 < 0) {
//                break
//            }
//            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
//                nums1[p] = nums1[p1--]
//            } else {
//                nums1[p] = nums2[p2--]
//            }
//        }
//        return nums1
//    }


}