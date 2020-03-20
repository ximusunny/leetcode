package algorithm.java.easy.invertTree;

public class Solution {
    public static void main(String[] args) {

    }

    private static TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode treeNodeLeft = invertTree(root.left);
        TreeNode treeNodeRight = invertTree(root.right);

        root.left = treeNodeRight;
        root.right = treeNodeLeft;

        return root;
    }


}
