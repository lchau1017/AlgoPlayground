package leetcode.recursion

import org.junit.jupiter.api.Test
import recursion.Fibonacci_Number
import kotlin.test.assertEquals

class Fibonacci_Number_Test {

    @Test
    fun `test_input_4_output_3`() {
        val expected = 3
        val testedClass = Fibonacci_Number()
        val result = testedClass.solution(4)
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_3_output_2`() {
        val expected = 2
        val testedClass = Fibonacci_Number()
        val result = testedClass.solution(3)
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_2_output_1`() {
        val expected = 1
        val testedClass = Fibonacci_Number()
        val result = testedClass.solution(2)
        assertEquals(expected, result)
    }

}