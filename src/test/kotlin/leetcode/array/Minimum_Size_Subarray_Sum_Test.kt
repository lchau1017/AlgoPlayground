package leetcode.array

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class Minimum_Size_Subarray_Sum_Test {


    @Test
    fun `test_input_7,(2,3,1,2,4,3)_output_2`() {
        val expected = 2
        val testedClass = `Minimum_Size_Subarray_Sum`()
        val result = testedClass.solution(7, intArrayOf(2, 3, 1, 2, 4, 3))
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_4,(1,4,4)_output_1`() {
        val expected = 1
        val testedClass = `Minimum_Size_Subarray_Sum`()
        val result = testedClass.solution(4, intArrayOf(1, 4, 4))
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_11,(1,1,1,1,1,1,1,1)_output_0`() {
        val expected = 0
        val testedClass = `Minimum_Size_Subarray_Sum`()
        val result = testedClass.solution(11, intArrayOf(1, 1, 1, 1, 1, 1, 1, 1))
        assertEquals(expected, result)
    }
}