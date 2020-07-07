package Solutions.tree;

import InterviewPrep.DataStucture.BinarySearchTree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> listOfLevels = new LinkedList<>();
        if (root == null) return listOfLevels;
        Queue<TreeNode> helperQueue = new LinkedList<>();
        helperQueue.add(root);
        return levelOrderTraversalHelper(listOfLevels, helperQueue);
    }

    private LinkedList<List<Integer>> levelOrderTraversalHelper(LinkedList<List<Integer>> listOfLevels, Queue<TreeNode> helperQueue) {
        while (!helperQueue.isEmpty()) {
            int size = helperQueue.size();
            List<Integer> currList = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = helperQueue.poll();
                currList.add(currNode.val);
                if (currNode.left!=null) helperQueue.add(currNode.left);
                if (currNode.right!=null) helperQueue.add(currNode.right);
            }
            listOfLevels.addFirst(currList);
        }
        return listOfLevels;
    }
}
