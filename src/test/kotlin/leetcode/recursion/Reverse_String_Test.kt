package leetcode.recursion

import org.junit.jupiter.api.Test
import recursion.Reverse_String
import kotlin.test.assertContentEquals

class Reverse_String_Test {

    @Test
    fun `test_input_('H','a','n','n','a','h')_output_('h','a','n','n','a','H')`() {
        val expected = charArrayOf('h', 'a', 'n', 'n', 'a', 'H')
        val testedClass = Reverse_String()
        val result = testedClass.solution(charArrayOf('H', 'a', 'n', 'n', 'a', 'h'))
        assertContentEquals(expected, result)
    }

    @Test
    fun `test_input_('h','e','l','l','o')_output_('o','l','l','e','h')`() {
        val expected = charArrayOf('o','l','l','e','h')
        val testedClass = Reverse_String()
        val result = testedClass.solution(charArrayOf('h','e','l','l','o'))
        assertContentEquals(expected, result)
    }

}