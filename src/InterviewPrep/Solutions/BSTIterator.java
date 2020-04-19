package InterviewPrep.Solutions;

import com.sun.source.tree.Tree;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BSTIterator {
    private TreeNode rootNode;
    private Stack<Integer> stackOfValues = new Stack<>();

    public BSTIterator(TreeNode root) {
        this.rootNode = root;
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return 0;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return false;
    }

    private void push() {
        this.pushHelper(rootNode);
    }

    private TreeNode pushHelper(TreeNode rootNode) {
        if (rootNode==null){
            return null;
        }
        TreeNode rightValue = pushHelper(rootNode.right);
        System.out.println(rightValue.val);
        TreeNode leftValue = pushHelper(rootNode.left);
        System.out.println(leftValue.val);
        return leftValue;
    }
}

