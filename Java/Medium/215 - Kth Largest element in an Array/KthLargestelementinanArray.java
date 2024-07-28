public class KthLargestelementinanArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int n : nums) {
            heap.add(n);
            if(heap.size() > k) {
                heap.poll();
            }
        }
        return heap.peek();
    }
}

// brute force approach

// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         Arrays.sort(nums);
//         return nums[nums.length - k];
//     }
// }
