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

        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy;
        ListNode fast = dummy;
        int counter = 0;

        while (fast != null) {
            counter++;
            if (counter > n + 1) {
                temp = temp.next;
            }
            fast = fast.next;
        }
        temp.next = temp.next.next;

        return dummy.next;
    }
}