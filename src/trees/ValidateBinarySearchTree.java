package trees;

public class ValidateBinarySearchTree {
  private Integer prev;

  public boolean isValidBST(TreeNode root) {
    prev = null;
    return inorder(root);
  }

  private boolean inorder(TreeNode root) {
    if (root == null) {
      return true;
    }
    if (!inorder(root.left)) {
      return false;
    }
    if (prev != null && root.val <= prev) {
      return false;
    }
    prev = root.val;
    return inorder(root.right);
  }
}
