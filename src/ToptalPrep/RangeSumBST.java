package ToptalPrep;

import DataStructure.TreeNode;

public class RangeSumBST {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        this.inOrder(root, low, high);
        return sum;
    }

    public void inOrder(TreeNode root, int low, int high) {
        if (root == null) return;
        inOrder(root.left, low, high);
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        inOrder(root.right, low, high);
    }
}
