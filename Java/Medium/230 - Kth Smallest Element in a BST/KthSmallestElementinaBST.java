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
public class KthSmallestElementinaBST {

    int kSmallest = Integer.MIN_VALUE;
    int counter = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return kSmallest;
    }

    public void inorder(TreeNode node, int k) {
        if(node == null || counter >= k) return;

        inorder(node.left, k);

        counter++;
        if(counter == k) {
            kSmallest = node.val;
            return;
        }

        inorder(node.right, k);
    }
}
