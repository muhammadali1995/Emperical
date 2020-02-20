package Solutions.recursion;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BinarySearchTreeSearch {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        if (val > root.val) {
            root = searchBST(root.right, val);
        } else {
            root = searchBST(root.left, val);
        }
        return root;
    }
}
