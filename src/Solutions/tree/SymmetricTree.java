package Solutions.tree;

import InterviewPrep.DataStucture.BinarySearchTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    private boolean isSimmetric = true;

    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.right == null && root.left == null)) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        bfsHelper(root, queue);
        return isSimmetric;
    }

    private void bfsHelper(TreeNode root, Queue<TreeNode> queue) {
        int size = queue.size();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            if (node != null) {
                list[i] = node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }

        for (int i = 0; i < size / 2; i++) {
            if (list[i] != list[list.length - 1 - i]) {
                isSimmetric = false;
                return;
            }
        }
    }
}
