package Solutions.tree;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> listOfLevels = new LinkedList<>();
        if (root == null) return listOfLevels;
        Queue<Node> helperQueue = new LinkedList<>();
        bsfHelper(root, listOfLevels, helperQueue);
        return listOfLevels;

    }

    private void bsfHelper(Node root, List<List<Integer>> listOfLevels, Queue<Node> helperQueue) {
        helperQueue.add(root);
        LinkedList<Integer> currLvlVals = new LinkedList<>();
        for (int i = 0; i < helperQueue.size(); i++) {
            Node node = helperQueue.poll();
            currLvlVals.push(node.val);
            for (Node child: node.children) {
                if (child!=null) helperQueue.add(child);
            }
        }
        listOfLevels.add(currLvlVals);
    }
}
