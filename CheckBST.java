package rank;

/**
 * created by @author suraj on 27/10/19
 */
public class CheckBST {

    static boolean checkBST(BTreeHeight.Node root) {

        BTreeHeight.Node left = root.left;

        if (left != null) {
            if (left.data > root.data) {
                return false;
            } else {
                checkBST(left);
            }
        }
        BTreeHeight.Node right = root.right;

        if (right != null) {
            if (right.data < root.data) {
                return false;
            } else {
                checkBST(root);
            }
        }
        return true;
    }

    class Node {
        int data;
        BTreeHeight.Node left;
        BTreeHeight.Node right;
    }
}
