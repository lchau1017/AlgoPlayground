package leetcode.recursion

import org.junit.jupiter.api.Test
import recursion.Climbing_Stairs
import kotlin.test.assertEquals

class Climbing_Stairs_Test {

    @Test
    fun `test_input_3_output_3`() {
        val expected = 3
        val testedClass = Climbing_Stairs()
        val result = testedClass.solution(3)
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_2_output_2`() {
        val expected = 2
        val testedClass = Climbing_Stairs()
        val result = testedClass.solution(2)
        assertEquals(expected, result)
    }


    @Test
    fun `test_input_4_output_5`() {
        val expected = 5
        val testedClass = Climbing_Stairs()
        val result = testedClass.solution(4)
        assertEquals(expected, result)
    }
}