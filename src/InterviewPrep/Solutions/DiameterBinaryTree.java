package InterviewPrep.Solutions;

public class DiameterBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root== null || (root.left==null && root.right==null)) return 0;
        return traverse(root,0, 0);
    }

    private int traverse(TreeNode root, int height, int max) {
        if (root == null) {
            return 0;
        }
        height++;
        System.out.println("h1 " + height);
        int heightLeft = traverse(root.left, height, max);
        System.out.println("h2 " + height);
        int heightRight = traverse(root.right, height, max);
        return 0;
    }
}
