package leetcode.recursion

import org.junit.jupiter.api.Test
import recursion.linkedlist.ListNode
import recursion.linkedlist.Swap_Nodes_In_Pairs
import kotlin.test.assertEquals

class Swap_Nodes_In_Pairs_Test {

//    @Test
//    fun `test_input_()_output_()`() {
//        val expected = null
//        val testedClass = Swap_Nodes_In_Pairs()
//        val head = null
//        val result = testedClass.solution(head)
//        checkNode(expected, result)
//    }
//
//    @Test
//    fun `test_input_(1)_output_(1)`() {
//        val expected = ListNode(1)
//
//        val testedClass = Swap_Nodes_In_Pairs()
//        val head = ListNode(1)
//        val result = testedClass.solution(head)
//        checkNode(expected, result)
//    }
//
//    @Test
//    fun `test_input_(1,2)_output_(2,1)`() {
//        val expected = ListNode(2)
//        expected.next = ListNode(1)
//
//        val testedClass = Swap_Nodes_In_Pairs()
//        val head = ListNode(1)
//        head.next = ListNode(2)
//        val result = testedClass.solution(head)
//        checkNode(expected, result)
//    }

    @Test
    fun `test_input_(1,2,3,4)_output_(2,1,4,3)`() {
        val expected = ListNode(2)
        expected.next = ListNode(1)
        expected.next!!.next = ListNode(4)
        expected.next!!.next!!.next = ListNode(3)

        val testedClass = Swap_Nodes_In_Pairs()
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        head.next!!.next!!.next = ListNode(4)
        val result = testedClass.solution(head)
        checkNode(expected, result)
    }

    private fun checkNode(expected: ListNode?, result: ListNode?) {
        if (expected != null) {
            assertEquals(expected.`val`, result?.`val`)
            checkNode(expected?.next, result?.next)
        }
    }
}