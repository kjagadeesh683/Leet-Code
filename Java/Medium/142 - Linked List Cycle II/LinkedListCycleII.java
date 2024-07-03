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
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        // Initialize two pointers, slow and fast to the head of the linkedlist
        ListNode slow = head;
        ListNode fast = head;

        // Traverse the linkedlist with slow and fast pointers
        while(fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;
            // Move fast two steps
            fast = fast.next.next;

            // If slow and fast pointers meet, a loop is detected
            if(slow == fast) {
                // Reset the slow pointer to the head of the list
                slow = head;

                // Find the first node of the loop
                while(slow != fast) {
                    // Move slow and fast one step at a time
                    slow = slow.next;
                    fast = fast.next;
                }

                // Return the first node of the loop
                return slow;
            }
        }

        // If no loop is found, return null
        return null;
    }
}

// ListNode temp = head;
// HashSet<ListNode> nodeSet = new HashSet<>();
// while(temp != null) {
//     if(nodeSet.contains(temp)) {
//         return temp;
//     }
//     nodeSet.add(temp);
//     temp = temp.next;
// }

// return null;
