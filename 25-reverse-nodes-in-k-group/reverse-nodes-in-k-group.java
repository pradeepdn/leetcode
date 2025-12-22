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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }
        
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode check = prev;
        ListNode curr, nextNode, reversedHead;
        int count = k;

        while (check != null) {
            check = prev;
            count = k;
            while (count > 0 && check != null) {
                check = check.next;
                count--;   
            }
            if (count > 0 || check == null) {
                break;
            }
            curr = prev.next;
            ListNode tail = curr;
            reversedHead = null;
            count = k;
            while (count > 0) {
                nextNode = curr.next;
                curr.next = reversedHead;
                reversedHead = curr;
                curr = nextNode;
                count--;
            }
            tail.next = curr;
            prev.next = reversedHead;
            prev = tail;

        }
        return dummy.next;
    }
}