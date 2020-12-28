package ToptalPrep;

import Solutions.ListNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthOfNaryTree {
    public int maxDepth(Node root) {

        if (root == null) return 0;

        int max = 0;
        Queue<Node> bfsQueue = new LinkedList<>();

        bfsQueue.add(root);
        int size = 1;

        while (bfsQueue.size() > 0) {
            for (int i = 0; i < size; i++) {
                Node currNode = bfsQueue.poll();
                bfsQueue.addAll(currNode.children);
            }
            max++;
            size = bfsQueue.size();
        }
        return max;
    }

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

    ;
}
