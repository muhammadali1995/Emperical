package InterviewPrep.Solutions;

public class BinarySearchTreetoGreaterSumTree {
    public TreeNode bstToGst(TreeNode root) {

        this.postOrderSum(root);
        return root;
    }

    int sum = 0;
    public void postOrderSum(TreeNode root){
        if (root == null) {
            return;
        }
        postOrderSum(root.right);
        sum += root.val;
        root.val = sum;
        postOrderSum(root.left);
    }

}
