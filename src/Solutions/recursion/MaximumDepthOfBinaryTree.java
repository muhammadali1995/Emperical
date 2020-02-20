package Solutions.recursion;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return findMaxDepth(root);
    }

    public int findMaxDepth(TreeNode root){
        if (root == null) {
            return 0;
        }

       int leftResult =  findMaxDepth(root.left);
       int rightResult =  findMaxDepth(root.right);
        if (leftResult > rightResult) {
            return leftResult + 1;
        } else {
            return rightResult + 1;
        }
    }

}
