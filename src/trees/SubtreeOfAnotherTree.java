package trees;

public class SubtreeOfAnotherTree {
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if(root == null) return false;


    // as soon as found the same value we need to check same structure or not
    // if same structure then return true
    // if not then search in the left and right
    if(root.val == subRoot.val) {
      boolean isSame = isSameStructure(root, subRoot);
      if(isSame) return isSame;
    }


    // search in left, if found return true
    // if we didn't find on left side, then search in right side
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }


  // this method is to check for 2 Tree is same structure or not
  public boolean isSameStructure(TreeNode root1, TreeNode root2) {
    // if one of them is null, then need to check other one is null or not
    // if null, return true, otherwise return false
    if(root1 == null || root2 == null) return root1 == root2;


    // now check both node value is same or not
    if(root1.val != root2.val) return false;

    // now check for left side and right side
    return isSameStructure(root1.left, root2.left) && isSameStructure(root1.right, root2.right);
  }
}
