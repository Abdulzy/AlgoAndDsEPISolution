package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LevelOrderTraversal2 {
  List<List<Integer>> levels = new ArrayList<List<Integer>>();
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    if(root == null){
      return levels;
    }
    int level = 0;
    helper(root,level);
    Collections.reverse(levels);
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
