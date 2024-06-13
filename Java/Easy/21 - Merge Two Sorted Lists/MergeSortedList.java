public class MergeSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;

        while(list1 != null || list2 != null) {
            if(list2 == null || (list1 != null && list1.val < list2.val)) {
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            } else{
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }
        }
        return head.next;
    }
}

        // ListNode root = new ListNode();
        // ListNode prev = root;
        // while (list1 != null && list2 != null) {
        //     if (list1.val < list2.val) {
        //         prev.next = list1;
        //         list1 = list1.next;
        //     } else {
        //         prev.next = list2;
        //         list2 = list2.next;
        //     }
        //     prev = prev.next;
        // }
        
        // if(list1 == null) {
        //     prev.next = list2;
        // } else {
        //     prev.next = list1;
        // }

        // return root.next;
