public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                // swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
     }
}

//// brute force approach ////

// boolean swapped;
// // run the steps n - 1 times
// for (int i = 0; i < nums.length; i++) {
//     swapped = false;
//     // for each step, max item will come at last respective index
//     for (int j = 1; j < nums.length - i; j++) {
//         // swap if the item is smaller than the previous item
//         if(nums[j] < nums[j - 1]){
//             //swap
//             int temp = nums[j];
//             nums[j] = nums[j - 1];
//             nums[j - 1] = temp;
//             swapped = true;
//         }
//     }

//     // if not swapped for a particular value of i, it means array is sorted, hence stop the program
//     if(!swapped){
//         break;
//     }

//// better approach ////

// int cnt0 = 0, cnt1 = 0, cnt2 = 0;

// for(int i = 0; i < nums.length; i++) {
//     if(nums[i] == 0) cnt0++;
//     else if(nums[i] == 1) cnt1++;
//     else cnt2++;
// }

// for(int i = 0; i < cnt0; i++) nums[i] = 0;
// for(int i = cnt0; i < cnt0 + cnt1; i++) nums[i] = 1;
// for(int i = cnt0 + cnt1; i < nums.length; i++) nums[i] = 2;
