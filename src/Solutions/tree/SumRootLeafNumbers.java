package Solutions.tree;

import InterviewPrep.DataStucture.BinarySearchTree.TreeNode;

public class SumRootLeafNumbers {
    private int sum = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        dfsHelper(root, 0);
        return sum;
    }

    private void dfsHelper(TreeNode root, int currVal) {
        currVal = currVal * 10 + root.val;
        if (root.right == null && root.left == null) {
            sum += currVal;
            return;
        }
        if (root.left != null) dfsHelper(root.left, currVal);
        if (root.right != null) dfsHelper(root.right, currVal);

    }
}
