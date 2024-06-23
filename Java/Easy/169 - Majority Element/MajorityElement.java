public class MajorityElement {
    public int majorityElement(int[] nums) {
        // declaring a map
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // storing the elements with its occurence
        for(int i = 0; i < nums.length; i++) {
             int value = map.getOrDefault(nums[i], 0);
             map.put(nums[i], value + 1);
        }

        // searching for majority element
        for(Map.Entry<Integer, Integer> it: map.entrySet()) {
            if(it.getValue() > nums.length/2) {
                return it.getKey();
            }
         }
         return -1;
    }
}

// brute force approach

// for(int i = 0; i < nums.length; i++) {
//     int count = 0;
//     for(int j = 0; j < nums.length; j++) {
//         if(nums[i] == nums[j]) {
//             count++;
//         }
//     }
//     if(count > nums.length/2) {
//         return nums[i];
//     }
// }
// return -1;
