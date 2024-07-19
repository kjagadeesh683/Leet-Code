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
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrderHelper(root, result, 0);
        return result;

    }

    public void levelOrderHelper(TreeNode curr, List<List<Integer>> result, int currDepth) {
        if(curr == null) {
            return;
        }
        if(currDepth == result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(currDepth).add(curr.val);
        levelOrderHelper(curr.left, result, currDepth + 1);
        levelOrderHelper(curr.right, result, currDepth + 1);
    }
}
