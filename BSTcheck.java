
public class BSTcheck {

	class Node {
        int data;
        Node left;
        Node right;
     }
	
    boolean checkBST(Node root) {
        return checkBST(root, 0, 10000);
    }

    boolean checkBST(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        }
        if (root.left != null && root.right != null) {
            if (root.left.data > root.data) {
                return false;
            }
            if (root.right.data < root.data) {
                return false;
            }
        }
        return checkBST(root.left, min, root.data) && checkBST(root.right, root.data, max);
    }
	
}
