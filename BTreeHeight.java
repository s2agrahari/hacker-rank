package rank;

/**
 * created by @author suraj on 23/10/19
 */
public class BTreeHeight {


    public static int heights(Node root, int height) {
        // Write your code here.

        if (root.left == null && root.right == null) {
            return height;
        }

        int leftHeight = 0;

        int rightHeight = 0;

        if (root.left != null) {
            leftHeight = heights(root.left, height + 1);
        }

        if (root.right != null) {
            rightHeight = heights(root.right, height + 1);
        }

        return Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        //heights(root, 0);
    }

    class Node {
        int data;
        Node left;
        Node right;
    }
}
