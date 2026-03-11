class Solution {
    public int removeDuplicates(int[] nums) {
        // Approach 1:
        // Set<Integer> unique = new TreeSet<>();
        // for (int num : nums) {
        //     unique.add(num);
        // }
        // int i = 0;
        // for (int num : unique) {
        //     nums[i++] = num;
        // }
        // return unique.size();

        //Approach 2:
        int l = 1;
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] != nums[r - 1]) {
                nums[l++] = nums[r];
            }
        }
        return l;
    }
}