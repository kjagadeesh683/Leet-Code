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
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode temp = head;

        while(temp != null && temp.next != null) {
            if(temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}


// brute force approach

// if(head == null || head.next == null) return head;

// Set<Integer> set = new HashSet<>();
// ListNode temp = head;

// ListNode list = new ListNode(0);
// ListNode current = list;

// while(temp != null) {
//     if(set.contains(temp.val)) {
//         temp = temp.next;
//     } else {
//         set.add(temp.val);
//         current.next = new ListNode(temp.val);
//         temp = temp.next;
//         current = current.next;
//     }
// }
// return list.next;
