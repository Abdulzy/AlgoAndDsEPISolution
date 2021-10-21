package trees;

public class sumRootToLeaf {
  int sum = 0;
  public int sumNumbers(TreeNode root) {
    int val = 0;
    helper(root,val);
    return sum;
  }

  public void helper(TreeNode root, int pathVal){
    if(root == null){
      return;
    }
    int tempPath = root.val + (pathVal * 10);

    if(root.left == null && root.right == null){
      sum = sum + tempPath;
    }
    helper(root.left,tempPath);
    helper(root.right,tempPath);

  }
}
