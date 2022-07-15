package recursion.linkedlist

class Swap_Nodes_In_Pairs {

    fun solution(head: ListNode?): ListNode? {
        return swapNodes(head, 1)
    }

    private fun swapNodes(head: ListNode?, count: Int): ListNode? {
        if (head?.next == null) {
            return head
        }

        val nextNode: ListNode = swapNodes(head!!.next, count + 1)!!

        return if (count % 2 != 0) {
            head.next = nextNode.next
            nextNode.next = head
            nextNode
        } else {
            head.next = nextNode
            head
        }
    }

}