class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(ans, 0, nums, list);
        return ans;
    }

    public void helper(List<List<Integer>> ans, int start, int[] nums, List<Integer> list) {
        if(start >= nums.length) {
            ans.add(new ArrayList<>(list));
        } else {
            list.add(nums[start]);
            // add the element and start the recursive call
            helper(ans, start + 1, nums, list);
            list.remove(list.size() - 1);
            // remove the element and do the backtracking call
            helper(ans, start + 1, nums, list);
        }
    }
}
