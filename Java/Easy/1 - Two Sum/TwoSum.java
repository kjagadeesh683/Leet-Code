public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if(nums[left] + nums[right] == target) {
                return new int[]{left, right};
            } else if(nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
     }
}

// brute force approach

// int[] ans = new int[2];
//         for(int i = 0; i < nums.length; i++) {
//             for(int j = i + 1; j < nums.length; j++) {
//                 if(nums[i] + nums[j] == target) {
//                     ans[0] = i;
//                     ans[1] = j;
//                     return ans;
//                 }
//             }
//         }
//         return ans;

// better approach

// int[] ans = new int[2];
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i < nums.length; i++) {
//             int num = nums[i];
//             int moreNeeded = target - num;

//             if(map.containsKey(moreNeeded)) {
//                 ans[0] = map.get(moreNeeded);
//                 ans[1] = i;
//                 return ans;
//             }
//             map.put(nums[i], i);
//         }
//         return ans;
