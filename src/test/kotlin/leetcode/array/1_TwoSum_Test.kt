package leetcode.array

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertSame

class `1_TwoSum_Test` {

    @Test
    fun `test nums(2,7,11,15),target = 9`() {
        val expected = intArrayOf(0, 1)
        val testedClass = `1_TwoSum`()
        val result = testedClass.twoSum(intArrayOf(2, 7, 11, 15), 9)
        assertContentEquals(expected, result)
    }
}