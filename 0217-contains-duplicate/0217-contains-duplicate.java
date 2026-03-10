class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (result.containsKey(nums[i])) {
                return true;
            }
            result.put(nums[i], i);
        }
        return false;
    }
}