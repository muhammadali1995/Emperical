package InterviewPrep.DataStucture.BinarySearchTree;

public class BTSTest {
    public static void main(String[] args) {
        BST bst = new BST();
        int[] vals = new int[]{4,1,6,0,2,5,7,3,8};
        for (int i = 0; i <vals.length ; i++) {
            bst.insert(vals[i]);
        }
//        System.out.println(bst.getNodeCount());
        bst.printValues();
//        System.out.println(bst.isInTree(30));
//        System.out.println(bst.getMin());
//        System.out.println(bst.getMax());

    }
}
