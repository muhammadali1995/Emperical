package ToptalPrep;


import DataStructure.TreeNode;

public class IncreasingOrderSearchTree {

    TreeNode newNode = null;
    TreeNode tempNode = null;

    public TreeNode increasingBST(TreeNode root) {
        this.createNewTree(root);
        return newNode;
    }

    public void createNewTree(TreeNode node) {
        if (node == null) return;
        createNewTree(node.left);
        if (newNode == null) {
            newNode = new TreeNode(node.val);
            tempNode = newNode;
        } else {
            tempNode.right = new TreeNode(node.val);
            tempNode = tempNode.right;
        }
        createNewTree(node.right);
    }


}
