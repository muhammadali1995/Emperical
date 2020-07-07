package InterviewPrep.DataStucture.BinarySearchTree;


public class BST {
    private TreeNode root;
    private int size = 0;

    public BST() {
        root = null;
    }

    public BST(int val) {
        root = new TreeNode(val);
        size++;
    }

    public void insert(int val) {
        if (root == null) {
            root = new TreeNode(val);
        } else {
            TreeNode parentNode = findParentNode(root, val);
            TreeNode right = parentNode.right;
            TreeNode left = parentNode.left;
            if (parentNode.val >= val) {
                parentNode.left = new TreeNode(val);
                parentNode.left.left = left;
            } else {
                parentNode.right = new TreeNode(val);
                parentNode.right.right = right;
            }
        }
        size++;
    }

    private TreeNode findParentNode(TreeNode root, int val) {
        while (root != null) {
            if (root.val <= val && (root.right == null)) {
                return root;
            } else if (root.val > val && (root.left == null)) {
                return root;
            } else if (root.val < val) {
                root = root.right;
            } else if (root.val > val) {
                root = root.left;
            }
        }
        return root;
    }

    public int getNodeCount() {
        return size;
    }

    public void printValues() {
        inOrderTraverse(root);
    }

    private void inOrderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraverse(root.left);
        System.out.println(root.val);
        inOrderTraverse(root.right);
    }

    int sum = 0;
    public void sums(){
        postOrderSum(root);
    }

    public void postOrderSum(TreeNode root){
        if (root == null) {
            return;
        }
        postOrderSum(root.right);
        sum += root.val;
        root.val = sum;
        postOrderSum(root.left);
    }

    public boolean isInTree(int val) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.val == val) {
                return true;
            } else if (curr.val > val) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        return false;
    }

    public int getMin() {
        int min = root.val;
        TreeNode curr = root;
        while (curr != null) {
            min = curr.val;
            curr = curr.left;
        }
        return min;
    }

    public int getMax() {
        TreeNode curr = root;
        int max = curr.val;
        while (curr != null) {
            max = curr.val;
            curr = curr.right;
        }
        return max;
    }

    public int deleteValue(int val) {
        TreeNode node = findParentNode(root, val);
        if (node != null) {
            if (node.left == null) {
                return 0;
            }
        }
        return 0;
    }

    private TreeNode findParent(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                return root;
            } else if (root.val <= val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return null;
    }

}
