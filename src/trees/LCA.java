package trees;

public class LCA {
  TreeNode found = null;
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    recurseTree(root,p,q);

    return this.found;
  }

  public boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q){
    if(currentNode == null){
      return false;
    }
    int left = this.recurseTree(currentNode.left, p, q) ? 1 : 0;

    int right = this.recurseTree(currentNode.right, p, q) ? 1 : 0;

    int mid = (currentNode == p || currentNode == q) ? 1 : 0;

    if (mid + left + right >= 2) {
      this.found = currentNode;
    }

    return (mid + left + right > 0);
  }
}
