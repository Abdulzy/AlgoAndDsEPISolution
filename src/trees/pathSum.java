package trees;

public class pathSum {
  public boolean hasPathSum(TreeNode root, int targetSum) {
    int val = 0;
    return helper(root,targetSum,val);
  }



  public boolean helper(TreeNode root,int total, int pathVal){
    if(root == null){
      return false;
    }
    int tempPath = root.val + pathVal;

    if(root.left == null && root.right == null){
      if(tempPath == total){
        return true;
      }
    }
    return helper(root.left,total,tempPath) || helper(root.right,total,tempPath);
  }
}
