package leetcode.array

import kotlin.test.Test
import kotlin.test.assertEquals

class `13_Roman_To_Integer_Test` {

    @Test
    fun `test_LVIII_equals_58`() {

        val expected = 58
        val testedClass = `13_Roman_To_Integer`()
        val result = testedClass.romanToInt("LVIII")
        assertEquals(expected, result)

    }

    @Test
    fun `test_MCMXCIV_equals_1994`() {

        val expected = 1994
        val testedClass = `13_Roman_To_Integer`()
        val result = testedClass.romanToInt("MCMXCIV")
        assertEquals(expected, result)

    }
}