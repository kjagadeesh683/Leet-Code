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

class Pair {
    TreeNode node;
    int num;
    Pair(TreeNode node, int num) {
        this.node = node;
        this.num = num;
    }
}

class MaximumWidthofBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));
        int maxWidth = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            int min = queue.peek().num;
            int first = 0, last = 0;

            for(int i = 0; i < size; i++) {
                int curr_id = queue.peek().num - min;
                TreeNode node = queue.peek().node;
                queue.poll();
                if(i == 0) first = curr_id;
                if(i == size - 1) last = curr_id;

                if(node.left != null) {
                    queue.offer(new Pair(node.left, 2*curr_id + 1));
                }

                if(node.right != null) {
                    queue.offer(new Pair(node.right, 2*curr_id + 2));
                }
            }

            maxWidth = Math.max(maxWidth, last - first + 1);

        }
        return maxWidth;
     }
}
