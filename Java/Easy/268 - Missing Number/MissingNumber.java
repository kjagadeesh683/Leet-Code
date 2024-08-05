class MissingNumber {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for(int i = 1; i <= nums.length; i++) {
            ans = ans ^ i;
        }
        for(int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}

//////////////////////////////////////////////////////////

// Approach 2

// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
        
//         // summation of first n numbers
//         int sum1 = n*(n + 1)/ 2;

//         int sum2 = 0;
//         for(int i = 0; i < nums.length; i++) {
//             sum2 += nums[i];
//         }

//         int missingNum = sum1 - sum2;

//         return missingNum;
//     }
// }

//////////////////////////////////////////////////////////

// Brute force approach

// // Outer loop that runs from i to N
// for(int i = 0; i <= nums.length; i++) {

//     // flag variable to check if element exists or not
//     int flag = 0;

//     // Search the element using linear search
//     for(int j = 0; j < nums.length; j++) {
//         if(nums[j] == i) {
//             flag = 1;
//             break;
//         }
//     }

//     // Check if the element is missing
//     if(flag == 0) {
//         return i;
//     }
// }

// // To avoid warnings
// return -1;

//////////////////////////////////////////////////////////

// better approach - Use Hashing
// int hash[] = new int[nums.length + 1];

// // storing the frequencies
// for(int i = 0; i < nums.length; i++) {
//     hash[nums[i]] += 1;
// }

// // checking the frequencies for the number
// for(int i = 0; i <= nums.length; i++) {
//     if(hash[i] == 0) {
//         return i;
//     }
// }

// return -1;
