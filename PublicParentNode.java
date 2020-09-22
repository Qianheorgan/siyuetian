import java.util.*;



public class PublicParentNode{

    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        if (root == null) {
            return 0;
        }
        if (root.val == o1 || root.val == o2) {
            return root.val;
        }
        int left = lowestCommonAncestor(root.left, o1, o2);
        int right = lowestCommonAncestor(root.right, o1, o2);
        if (left != 0 && right != 0) {
            return root.val;
        }
        if (left == 0) {
            return right;
        }
        if (right == 0) {
            return left;
        }
        return 0;
    }
}