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
    public ListNode insertionSortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode copy=head;
        while(copy!=null){
            list.add(copy.val);
            copy=copy.next;
        }
        Collections.sort(list);

        ListNode dummy= new ListNode();
        ListNode temp=dummy;
        for(int val:list)
        {
            ListNode node= new ListNode(val);
            temp.next=node;
            temp=temp.next;
        }
        return dummy.next;
    }
}