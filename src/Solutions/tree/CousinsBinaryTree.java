package Solutions.tree;

import InterviewPrep.DataStucture.BinarySearchTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CousinsBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        int currentLevel = 0;
        int newLevel = 0;
        Queue<TreeNode> helperQueue = new LinkedList<>();
        helperQueue.add(root);
        currentLevel++;
        return levelOrderTraversal(helperQueue, currentLevel, newLevel, x, y);

    }

    private boolean levelOrderTraversal(Queue<TreeNode> helperQueue, int currentLevel, int newLevel, int x, int y) {
        int count = 0;
        while (!helperQueue.isEmpty()) {
            TreeNode currNode = helperQueue.poll();
            if (currNode != null) {
                if (checkIfHasSameParent(currNode, x, y)) return false;
                if (currNode.val ==x|| currNode.val ==y) count++;
                helperQueue.add(currNode.left);
                helperQueue.add(currNode.right);
                newLevel += 2;
            }
            currentLevel--;
            if (count==2) return true;
            if (currentLevel == 0) {
                count = 0;
                currentLevel = newLevel;
                newLevel = 0;
            }
        }
        return false;
    }

    private boolean checkIfHasSameParent(TreeNode node, int x, int y) {
        if (node.left != null && node.right != null) {
            if ((node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x))
                return true;
        }
        return false;
    }
}
