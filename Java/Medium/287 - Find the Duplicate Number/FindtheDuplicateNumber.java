public class FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        fast = nums[0];

        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}

//// optimal approach ////
// Time complexity: O(N). Since we traversed through the array only once.
// Space complexity: O(1).

//// brute force approach ////

// Arrays.sort(nums);
// for(int i = 0; i < nums.length - 1; i++) {
//     if(nums[i] == nums[i + 1]) {
//         return nums[i];
//     }
// }
// return 0;

// Time Complexity: O(Nlogn + N), NlogN for sorting the array and O(N) for traversing through the array and checking if adjacent elements are equal or not.
// Space Complexity: O(1)

//// better approach ////

// int[] freq = new int[nums.length + 1];

// for(int i = 0; i < nums.length; i++) {
//     if(freq[nums[i]] == 0) {
//         freq[nums[i]] += 1;
//     } else {
//         return nums[i];
//     }
// }
// return 0;

// Time Complexity: O(N), as we are traversing through the array only once.
// Space Complexity: O(N), as we are using extra space for frequency array.
