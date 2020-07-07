package Solutions.tree;

import InterviewPrep.DataStucture.BinarySearchTree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageofLevelsinBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        LinkedList<Double> listOfAverages = new LinkedList<>();
        if (root == null) return listOfAverages;
        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.add(root);
        return levelOrderTraversalHelper(listOfAverages, nodesQueue);
    }

    private LinkedList<Double> levelOrderTraversalHelper(LinkedList<Double> listOfLevels, Queue<TreeNode> nodeQueue) {
        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            double currSum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode currNode = nodeQueue.poll();
                currSum += currNode.val;
                if (currNode.left != null) nodeQueue.add(currNode.left);
                if (currNode.right != null) nodeQueue.add(currNode.right);
            }
            listOfLevels.addFirst(currSum / (double) size);
        }
        return listOfLevels;
    }
}
