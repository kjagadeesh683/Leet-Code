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
public class DeletetheMiddleNodeofaLinkedList {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        fast = fast.next.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}

// if(head == null || head.next == null) return null;

// int length = 0;
// ListNode temp = head;
// while(temp != null) {
//     length++;
//     temp = temp.next;
// }
// int res = length/2;
// temp = head;
// while(temp != null) {
//     res--;
//     if(res == 0) {
//         temp.next = temp.next.next;
//     }
//     temp = temp.next;
// }

// return head;
