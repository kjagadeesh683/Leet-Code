public class FindtheKthLargestIntegerintheArray {
    public String kthLargestNumber(String[] nums, int k) {
        if(nums == null || nums.length == 0) return "";
        int length = nums.length;
        PriorityQueue<String> minHeap = new PriorityQueue<>((s1, s2) -> {
            if(s1.length() == s2.length()) return s1.compareTo(s2);
            else return Integer.compare(s1.length(), s2.length());
        });
        for(String numStr : nums) {
            minHeap.offer(numStr);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
