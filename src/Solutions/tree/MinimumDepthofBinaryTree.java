package Solutions.tree;

import InterviewPrep.DataStucture.BinarySearchTree.TreeNode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        ArrayList<Integer> leafs = new ArrayList<>();
        dfsHelper(root, leafs, 1);
        int min = Integer.MAX_VALUE;
        for (int i : leafs) {
            min = Math.min(min, i);
        }
        return min;
    }

    public void dfsHelper(TreeNode node, ArrayList<Integer> leafs, int level) {
        if (node != null && node.left == null && node.right == null) {
            leafs.add(level);
            return;
        }
        if (node != null) {
            dfsHelper(node.left, leafs, level + 1);
            dfsHelper(node.right, leafs, level + 1);
        }
    }
}
