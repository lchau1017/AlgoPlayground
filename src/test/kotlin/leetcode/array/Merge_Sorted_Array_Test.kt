package leetcode.array

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class Merge_Sorted_Array_Test {

    @Test
    fun `test_input_nums1(1,2,3,0,0,0),m=3, nums2(2,5,6),n=3_output_(1,2,2,3,5,6)`() {
        val expected = intArrayOf(1, 2, 2, 3, 5, 6)
        val testedClass = Merge_Sorted_Array()
        val result = testedClass.solution(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
        assertContentEquals(expected, result)
    }

    @Test
    fun `test_input_nums1(1),m=1, nums2(0),n=0_output_(1)`() {
        val expected = intArrayOf(1)
        val testedClass = Merge_Sorted_Array()
        val result = testedClass.solution(intArrayOf(1), 1, intArrayOf(), 0)
        assertContentEquals(expected, result)
    }

    @Test
    fun `test_input_nums1(0),m=0, nums2(1),n=1output_(1)`() {
        val expected = intArrayOf(1)
        val testedClass = Merge_Sorted_Array()
        val result = testedClass.solution(intArrayOf(0), 0, intArrayOf(1), 1)
        assertContentEquals(expected, result)
    }

    @Test
    fun `test_input_nums1(2,0),m=1, nums2(1),n=1output_(1,2)`() {
        val expected = intArrayOf(1, 2)
        val testedClass = Merge_Sorted_Array()
        val result = testedClass.solution(intArrayOf(2, 0), 1, intArrayOf(1), 1)
        assertContentEquals(expected, result)
    }
}