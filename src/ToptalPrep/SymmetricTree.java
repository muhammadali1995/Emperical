package ToptalPrep;

import DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.right == null && root.left == null)) return true;

        Stack<TreeNode> leftQ = new Stack<>();
        Queue<TreeNode> rightQ = new LinkedList<>();

        leftQ.push(root.left);
        rightQ.add(root.right);

        while (!leftQ.isEmpty() || !rightQ.isEmpty()) {
            int size = leftQ.size();
            for (int i = size; i>=0; i--) {
                TreeNode left = leftQ.pop();
                TreeNode right = rightQ.poll();
                if ((left!=null && right!=null) && left.val != right.val) return false;
                else if ((left==null && right!=null) ||  (left!=null && right==null)) return false;
                else{
                    if (left!=null) {
                        leftQ.push(left.left);
                        leftQ.push(left.right);
                    }

                    if (right!=null) {
                        rightQ.add(right.left);
                        rightQ.add(right.right);
                    }
                }
            }
        }



        return  leftQ.empty() && rightQ.isEmpty();

    }
}
