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
    public ListNode partition(ListNode head, int x) {
        ListNode headDummy = head;
        ListNode less = new ListNode(0,null);
        ListNode greater = new ListNode(0,null);
        ListNode greaterdummy = greater;
        ListNode lessdummy = less; 

        while (headDummy != null) {
            if (headDummy.val < x) {
                less.next = new ListNode(headDummy.val, null);
                less = less.next;    
            }
            if (headDummy.val >= x) {
                greater.next = new ListNode(headDummy.val, null);
                greater = greater.next;
            }
            headDummy = headDummy.next;
        }

        less.next = greaterdummy.next;

        return lessdummy.next;
    }
}