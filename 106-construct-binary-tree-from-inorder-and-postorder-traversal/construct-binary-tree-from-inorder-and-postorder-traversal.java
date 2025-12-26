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
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            hash.put(inorder[i], i);
        }
        return build(0, postorder.length - 1, 0, inorder.length - 1, postorder, hash);
    }

    public TreeNode build(int postStart, int postEnd, int inStart, int inEnd, int[] postorder,
            Map<Integer, Integer> hash) {
        if (postStart > postEnd || inStart > inEnd) {
            return null;
        }

        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);
        int rootIndexinorder = hash.get(rootVal);
        int leftSubSize = rootIndexinorder - inStart;

        root.left = build(postStart, postStart + leftSubSize - 1, inStart, rootIndexinorder - 1, postorder, hash);
        root.right = build(postStart + leftSubSize, postEnd - 1, rootIndexinorder + 1, inEnd, postorder, hash);

        return root;
    }
}