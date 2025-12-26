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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            hash.put(inorder[i], i);
        }
        return helper(0, preorder.length - 1, 0, inorder.length - 1, preorder, hash);
    }

    public TreeNode helper(int preStart, int preEnd, int inStart, int inEnd, int[] preorder,
            Map<Integer, Integer> hash) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int rootValue = preorder[preStart];
        TreeNode root = new TreeNode(rootValue);
        int rootIndexInInorder = hash.get(rootValue);
        int leftSubSize = rootIndexInInorder - inStart;

        root.left = helper(preStart + 1, preStart + leftSubSize, inStart, rootIndexInInorder - 1, preorder, hash);
        root.right = helper(preStart + leftSubSize + 1, preEnd, rootIndexInInorder + 1, inEnd, preorder, hash);

        return root;
    }
}
