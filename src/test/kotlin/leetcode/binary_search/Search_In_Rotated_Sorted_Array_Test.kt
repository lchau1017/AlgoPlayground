package leetcode.binary_search

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Search_In_Rotated_Sorted_Array_Test {


    @Test
    fun `test_input_(4,5,6,7,0,1,2),0_output_4`() {
        val expected = 4
        val testedClass = `Search_In_Rotated_Sorted_Array`()
        val result = testedClass.solution(intArrayOf(4,5,6,7,0,1,2),0)
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_(4,5,6,7,0,1,2),3_output_-1`() {
        val expected = -1
        val testedClass = `Search_In_Rotated_Sorted_Array`()
        val result = testedClass.solution(intArrayOf(4,5,6,7,0,1,2),3)
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_(1),0_output_-1`() {
        val expected = -1
        val testedClass = `Search_In_Rotated_Sorted_Array`()
        val result = testedClass.solution(intArrayOf(1),0)
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_(1,3),0_output_-1`() {
        val expected = -1
        val testedClass = `Search_In_Rotated_Sorted_Array`()
        val result = testedClass.solution(intArrayOf(1,3),0)
        assertEquals(expected, result)
    }
}