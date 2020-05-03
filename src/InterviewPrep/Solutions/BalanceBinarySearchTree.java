package InterviewPrep.Solutions;


import java.lang.reflect.Array;
import java.util.ArrayList;


public class BalanceBinarySearchTree {
    ArrayList<Integer> vals = new ArrayList<>();

    public InterviewPrep.Solutions.TreeNode balanceBST(TreeNode root) {
        inOrderTraverse(root);
        while (vals.size() > 1) {
         }
        return root;
    }

    public void insert(TreeNode root, int val) {
        TreeNode parentNode = findParentNode(root, val);
        TreeNode right = parentNode.right;
        TreeNode left = parentNode.left;
        if (parentNode.val >= val) {
            parentNode.left = new TreeNode(val);
            parentNode.left.left = left;
        } else {
            parentNode.right = new TreeNode(val);
            parentNode.right.right = right;
        }
    }

    private TreeNode findParentNode(TreeNode root, int val) {
        while (root != null) {
            if (root.val <= val && (root.right == null)) {
                return root;
            } else if (root.val > val && (root.left == null)) {
                return root;
            } else if (root.val < val) {
                root = root.right;
            } else if (root.val > val) {
                root = root.left;
            }
        }
        return root;
    }

    private void inOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraverse(root.left);
        vals.add(root.val);
        inOrderTraverse(root.right);
    }

}
