package leetcode.recursion

import org.junit.jupiter.api.Test
import recursion.linkedlist.ListNode
import recursion.linkedlist.Reverse_Linked_List
import kotlin.test.assertEquals

class Reverse_Linked_List_Test {

//    @Test
//    fun `test_input_(1,2)_output_(2,1)`() {
//        val expected = ListNode(2)
//        expected.next = ListNode(1)
//
//        val testedClass = Reverse_Linked_List()
//        val head = ListNode(1)
//        head.next = ListNode(2)
//        val result = testedClass.solution(head)
//        checkNode(expected, result)
//    }

//        @Test
//    fun `test_input_(1,2,3)_output_(3,2,1)`() {
//        val expected = ListNode(3)
//        expected.next = ListNode(2)
//        expected.next!!.next = ListNode(2)
//
//        val testedClass = Reverse_Linked_List()
//        val head = ListNode(1)
//        head.next = ListNode(2)
//        head.next!!.next = ListNode(3)
//        val result = testedClass.solution(head)
//        checkNode(expected, result)
//    }

    @Test
    fun `test_input_(1,2,3,4)_output_(4,3,2,1)`() {
        val expected = ListNode(4)
        expected.next = ListNode(3)
        expected.next!!.next = ListNode(2)
        expected.next!!.next!!.next = ListNode(1)

        val testedClass = Reverse_Linked_List()
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