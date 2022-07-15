package leetcode.array

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Array_Partition_I_Test {

    @Test
    fun `test_input_(1,4,3,2)_output_4`() {
        val expected = 4
        val testedClass = `Array_Partition_I`()
        val result = testedClass.solution(intArrayOf(1, 4, 3, 2))
        assertEquals(expected, result)
    }
}