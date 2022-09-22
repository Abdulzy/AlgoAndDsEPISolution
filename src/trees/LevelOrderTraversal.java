package trees;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {
  List<List<Integer>> levels = new ArrayList<List<Integer>>();
  public List<List<Integer>> levelOrder(TreeNode root) {
    if(root == null){
      return levels;
    }
    int level = 0;
    helper(root,level);
    return levels;
  }
  public void helper(TreeNode root, int x){
    if (levels.size() == x)
      levels.add(new ArrayList<Integer>());
    levels.get(x).add(root.val);
    if (root.left != null)
      helper(root.left, x + 1);
    if (root.right != null)
      helper(root.right, x + 1);
    return;
  }
}
