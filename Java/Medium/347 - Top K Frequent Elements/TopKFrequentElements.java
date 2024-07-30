public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for(int key : map.keySet()) {
            maxHeap.add(key);
        }
        int res[] = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = maxHeap.poll();
        }
        return res;
    }
}

// Time Complexity : O(klogn)
// Space Complexity : O(n)
