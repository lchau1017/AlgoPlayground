package leetcode.array

import kotlin.test.Test
import kotlin.test.assertEquals

class `747_Largest_Number_At_Least_Twice_Of_Others_Test` {

    @Test
    fun `test_input_(3,6,1,0)_output_1`() {
        val expected = 1
        val testedClass = `747_Largest_Number_At_Least_Twice_Of_Others`()
        val result = testedClass.solution(intArrayOf(3,6,1,0))
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_()_output_-1`() {
        val expected = -1
        val testedClass = `747_Largest_Number_At_Least_Twice_Of_Others`()
        val result = testedClass.solution(intArrayOf())
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_(1)_output_0`() {
        val expected = 0
        val testedClass = `747_Largest_Number_At_Least_Twice_Of_Others`()
        val result = testedClass.solution(intArrayOf(1))
        assertEquals(expected, result)
    }

}