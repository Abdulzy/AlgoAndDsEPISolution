package trees;

import java.util.LinkedList;
import java.util.List;

public class ExteriorTree {
  public static List<TreeNode> exteriorBinaryTree(
    TreeNode tree) {
    List<TreeNode> exterior = new LinkedList<>();
    if (tree != null) {
      exterior.add(tree);
      exterior.addAll(leftBoundaryAndLeaves(tree.left, true));
      exterior.addAll(rightBoundaryAndLeaves(tree.right, true));
    }
    return exterior;
  }

  // Computes the nodes from the root to the leftmost leaf followed by all the
// leaves in subtreeRoot.
  private static List<TreeNode> leftBoundaryAndLeaves(
    TreeNode subtreeRoot, boolean isBoundary) {
    List<TreeNode> result = new LinkedList<>();
    if (subtreeRoot != null) {
      if (isBoundary || isLeaf(subtreeRoot)) {
        result.add(subtreeRoot);
      }
      result.addAll(leftBoundaryAndLeaves(subtreeRoot.left, isBoundary));
      result.addAll(leftBoundaryAndLeaves(
        subtreeRoot.right, isBoundary && subtreeRoot.left == null));
    }
    return result;
  }

  // Computes the leaves in left-to-right order followed by the rightmost leaf
// to the root path in subtreeRoot.
  private static List<TreeNode> rightBoundaryAndLeaves(
    TreeNode subtreeRoot, boolean isBoundary) {
    List<TreeNode> result = new LinkedList<>();
    if (subtreeRoot != null) {
      result.addAll(rightBoundaryAndLeaves(
        subtreeRoot.left, isBoundary && subtreeRoot.right == null));
      result.addAll(rightBoundaryAndLeaves(subtreeRoot.right, isBoundary));
      if (isBoundary || isLeaf(subtreeRoot)) {
        result.add(subtreeRoot);
      }

    }
    return result;
  }

  private static boolean isLeaf(TreeNode node) {
    return node.left == null && node.right == null;
  }
}

