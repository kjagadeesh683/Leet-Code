public class MoveZeroes {
    public void moveZeroes(int[] nums) {
    
    int size = nums.length;
    if(size == 0 || size == 1) {
        return;
    }

    int j = 0;
    for(int i = 0; i < size; i++) {
        if(nums[i] != 0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
    }
    }
}

//// Brute force approach ////

// ArrayList<Integer> temp = new ArrayList<>();
// for(int i = 0; i < nums.length; i++) {
//     if(nums[i] != 0) {
//         temp.add(nums[i]);
//     }
// }

// int nz = temp.size();

// for(int i = 0; i < nz; i++) {
//     nums[i] = temp.get(i);
// }

// for(int i = nz; i < nums.length; i++) {
//     nums[i] = 0;
// }
