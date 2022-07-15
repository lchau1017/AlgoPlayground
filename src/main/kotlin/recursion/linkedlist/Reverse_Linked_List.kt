package recursion.linkedlist

class Reverse_Linked_List {

    fun solution(head: ListNode?): ListNode? {
        return reverseList(head)
    }

    private fun reverseList(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }
        val p: ListNode = reverseList(head.next)!!
        head.next!!.next = head
        head.next = null
        return p
    }

}