package trees;

import java.util.ArrayList;
import java.util.List;

public class LinkedListOfLeaves {
  public List<Integer> leaves1 = new ArrayList();
  public List<Integer> leafSimilar(TreeNode root1) {
    dfs(root1);
    return leaves1;
  }

  public void dfs(TreeNode node) {
    if (node != null) {
      if (node.left == null && node.right == null)
        leaves1.add(node.val);
      else{
        dfs(node.left);
        dfs(node.right);
      }
    }
  }
}
