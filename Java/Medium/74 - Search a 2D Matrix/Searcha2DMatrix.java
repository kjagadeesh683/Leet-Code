public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++) {
            if(matrix[i][0] <= target && target <= matrix[i][n-1]) {
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }

    public boolean binarySearch(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while(low <= high) {
            int mid = low + (high - low)/ 2;
            if(arr[mid] == target) {
                return true;
            } else if(arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}

// brute force approach

// int m = matrix.length;
// int n = matrix[0].length;

//         for(int i = 0; i < m; i++) {
//             for(int j = 0; j < n; j++) {
//                 if(matrix[i][j] == target) {
//                     return true;
//                 }
//             }
//         }
//         return false;
