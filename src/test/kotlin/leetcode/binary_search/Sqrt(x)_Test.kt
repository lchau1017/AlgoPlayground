package leetcode.binary_search

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `Sqrt(x)_Test` {

    @Test
    fun `test_input_4_output_2`() {
        val expected = 2
        val testedClass = `Sqrt(x)`()
        val result = testedClass.solution(4)
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_17_output_4`() {
        val expected = 4
        val testedClass = `Sqrt(x)`()
        val result = testedClass.solution(17)
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_8_output_3`() {
        val expected = 2
        val testedClass = `Sqrt(x)`()
        val result = testedClass.solution(8)
        assertEquals(expected, result)
    }
}