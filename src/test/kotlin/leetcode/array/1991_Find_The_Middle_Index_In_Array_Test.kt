package leetcode.array

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `1991_Find_The_Middle_Index_In_Array_Test` {

    @Test
    fun `test_input_(1,7,3,6,5,6)_output_3`() {
        val expected = 3
        val testedClass = `1991_Find_The_Middle_Index_In_Array`()
        val result = testedClass.solution(intArrayOf(1,7,3,6,5,6))
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_(null)_output_-1`() {
        val expected = -1
        val testedClass = `1991_Find_The_Middle_Index_In_Array`()
        val result = testedClass.solution(intArrayOf())
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_(1)_output_0`() {
        val expected = 0
        val testedClass = `1991_Find_The_Middle_Index_In_Array`()
        val result = testedClass.solution(intArrayOf(1))
        assertEquals(expected, result)
    }
}