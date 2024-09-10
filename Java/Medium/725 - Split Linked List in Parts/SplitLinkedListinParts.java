// Link: https://leetcode.com/problems/split-linked-list-in-parts/description/

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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res= new ListNode[k];

        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        int base_length = length / k, remainder = length % k;

        curr = head;
        ListNode prev = null;

        for (int i = 0; i < k; i++) {
            res[i] = curr;
            for (int j = 0; j < base_length + (remainder > 0 ? 1 : 0); j++) {
                prev = curr;
                curr = curr.next;
            }

            remainder -= remainder > 0 ? 1 : 0;

            if (prev != null) {
                prev.next = null;
            }
        }
        return res;
    }
}
