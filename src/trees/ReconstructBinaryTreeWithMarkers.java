package trees;

import java.util.List;

public class ReconstructBinaryTreeWithMarkers {
  private static Integer subtreeldx;
  public static TreeNode reconstructPreorder (
    List<Integer > preorder) {
    subtreeldx = 0;
    return reconstructPreorderSubtree(preorder) ;
  }
  // Reconstructs the subtree that is rooted at subtreeldx .
  private static TreeNode reconstructPreorderSubtree (
    List<Integer> preorder) {
    Integer subtreeKey = preorder.get(subtreeldx);
    ++subtreeldx;
    if (subtreeKey == null) {
      return null;
    }
// Note that reconstructPreorderSubtree updates subtreeldx. So the order of
// following two calls are critical.
    TreeNode leftSubtree = reconstructPreorderSubtree(preorder);
    TreeNode rightSubtree = reconstructPreorderSubtree(preorder);
    return new TreeNode(subtreeKey, leftSubtree, rightSubtree);
  }
}
