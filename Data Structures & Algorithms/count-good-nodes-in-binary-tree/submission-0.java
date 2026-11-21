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

class Solution {
    public int goodNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int count = 0;

        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> maxValues = new LinkedList<>();

        q.add(root);
        maxValues.add(root.val);

        while (!q.isEmpty()) {

            TreeNode node = q.poll();
            int maxVal = maxValues.poll();

            if (node.val >= maxVal) {
                count++;
            }

            int currentMax = Math.max(maxVal, node.val);

            if (node.left != null) {
                q.add(node.left);
                maxValues.add(currentMax);
            }

            if (node.right != null) {
                q.add(node.right);
                maxValues.add(currentMax);
            }
        }

        return count;
    }
}
