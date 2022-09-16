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
        if(head == null) return null;
        ListNode p1 = head, p2 = head;
        while(n-- >= 0){a
            if(p1 == null) return head.next; //if p1 become null before the n reduce to less than 0, that means the first element will be removed
            p1 = p1.next; //p1 will go first, until there is n node between p1 and p2
        }
        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next; //when p1 become null, the node infront of p2 is the node we want to delete
        }
        p2.next = p2.next.next;
        return head;
    }
}