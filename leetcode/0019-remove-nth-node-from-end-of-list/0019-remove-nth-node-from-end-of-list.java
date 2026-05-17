/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0)
        return head;

    ListNode dummy = new ListNode(0);

        dummy.next = head;

    ListNode slow = dummy, fast = dummy;

    // Move fast pointer to the n+1th node from the beginning
    for (int i = 0; i <= n; i++) {
        if (fast == null)
            return head; // Handle edge case when n is greater than the number of nodes
        fast = fast.next;
    }

    // Move both pointers until fast reaches the end
    while (fast != null) {
        slow = slow.next;
        fast = fast.next;
    }

    // Skip the desired node
    slow.next = slow.next.next;

    return dummy.next;
    }
}