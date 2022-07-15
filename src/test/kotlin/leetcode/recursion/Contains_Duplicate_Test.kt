package leetcode.recursion

import leetcode.array.Contains_Duplicate
import org.junit.jupiter.api.Test
import recursion.Reverse_String
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals


class Contains_Duplicate_Test {

    @Test
    fun `test_input_(1,2,3,1)_output_true`() {
        val expected = true
        val testedClass = Contains_Duplicate()
        val result = testedClass.solution(intArrayOf(1, 2, 3, 1))
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_(1000000000,1000000000,11)_output_true`() {
        val expected = true
        val testedClass = Contains_Duplicate()
        val result = testedClass.solution(intArrayOf(1000000000, 1000000000, 11))
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_(0)_output_false`() {
        val expected = false
        val testedClass = Contains_Duplicate()
        val result = testedClass.solution(intArrayOf(0))
        assertEquals(expected, result)
    }

    @Test
    fun `test_input_(1,5,-2,-4,0)_output_false`() {
        val expected = false
        val testedClass = Contains_Duplicate()
        val result = testedClass.solution(intArrayOf(1, 5, -2, -4, 0))
        assertEquals(expected, result)
    }


}