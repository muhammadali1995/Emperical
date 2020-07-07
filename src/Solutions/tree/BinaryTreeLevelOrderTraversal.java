package Solutions.tree;

import InterviewPrep.DataStucture.BinarySearchTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listOfLevels = new ArrayList<>();
        if (root == null) return listOfLevels;
        int currentLevel = 0, newLevel = 0;
        Queue<TreeNode> helperQueue = new LinkedList<>();
        helperQueue.add(root);
        currentLevel++;
        return levelOrderTraversal(listOfLevels, helperQueue, currentLevel, newLevel);
    }

    private List<List<Integer>> levelOrderTraversal(List<List<Integer>> listOfLevels, Queue<TreeNode> helperQueue, int currentLevel, int newLevel) {
        List<Integer> currList = new ArrayList<>();
        while (!helperQueue.isEmpty()) {
            TreeNode currNode = helperQueue.poll();
            currList.add(currNode.val);
            currentLevel--;
            if (currNode.left != null) {
                helperQueue.offer(currNode.left);
                newLevel++;
            }
            if (currNode.right != null) {
                helperQueue.offer(currNode.right);
                newLevel++;
            }
            if (currentLevel == 0) {
                listOfLevels.add(currList);
                currentLevel = newLevel;
                newLevel = 0;
                currList = new ArrayList<>();
            }
        }
        return listOfLevels;
    }
}
