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
public class CountGoodNodesinBinaryTree {
    int result = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return result;
    }

    public void dfs(TreeNode root, int maxVal) {
        if(root == null) return;
        if(root.val >= maxVal) {
            result++;
            maxVal = root.val;
        }
        dfs(root.left, maxVal);
        dfs(root.right, maxVal);
    }
}
