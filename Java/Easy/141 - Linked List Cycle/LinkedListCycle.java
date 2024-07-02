/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        // Initialize two pointers, slow and fast to the head of the linkedlist
        ListNode slow = head;
        ListNode fast = head;

        // Traverse the linkedlist with slow and fast pointers
        while(fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;
            // Move fast two steps
            fast = fast.next.next;

            // Check if slow and fast pointers meet
            if(slow == fast) {
                return true; // Loop detected
            }
        }

        // If fast reaches end of the list, there is no loop
        return false;
    }
}

// Brute force approach

// ListNode temp = head;
// HashSet<ListNode> nodeSet = new HashSet<>();
// while(temp != null) {
//     if(nodeSet.contains(temp)) {
//         return true;
//     }
//     nodeSet.add(temp);
//     temp = temp.next;
// }
// return false;
