/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class SearchinaBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        
        while(root != null && root.val != val) {
            root = val < root.val ? root.left : root.right;
        }
        
        return root;
    }
}


// class Solution {
//     public TreeNode searchBST(TreeNode root, int val) {
//         if(root == null || root.val == val) return root;

//         while(root != null) {
//             if(val < root.val) {
//                 root = root.left;
//             } else if(val > root.val) {
//                 root = root.right;
//             } else {
//                 return root;
//             }
//         }
//         return null;
//     }
// }


