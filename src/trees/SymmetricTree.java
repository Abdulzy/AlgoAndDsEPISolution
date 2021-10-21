package trees;

public class SymmetricTree {
  public boolean isSymmetric(TreeNode root) {
    return root == null || helper(root.left, root.right);
  }

  private boolean helper(TreeNode first, TreeNode second ){
    if(first == null && second == null){
      return true;
    }
    else if( second != null && first != null){
      return second.val == first.val
        && helper(second.left,first.right)
        && helper(second.right, first.left);
    }
    return false;

  }
}
