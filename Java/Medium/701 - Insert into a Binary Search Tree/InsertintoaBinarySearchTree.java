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
public class InsertintoaBinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
	    if(root == null) {
	        return new TreeNode(val);
	    }
	    
	    TreeNode temp = root;
	    
	    while(true) {
	        if(val == temp.val) {
	            return root;
	        }
	        
	        if(val < temp.val) {
	            if(temp.left == null) {
	                temp.left = new TreeNode(val);
	                return root;
	            }
	            temp = temp.left;
	        } else {
	            if(temp.right == null) {
	                temp.right = new TreeNode(val);
	                return root;
	            }
	            temp = temp.right;
	        }
	    }
    }
}
