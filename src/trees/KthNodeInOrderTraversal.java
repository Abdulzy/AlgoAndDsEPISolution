package trees;

public class KthNodeInOrderTraversal {
//  public static TreeNode<Integer> findKthNodeBinaryTree(
//    TreeNode<Integer> tree, int k) {
//    TreeNode<Integer> iter = tree;
//    while (iter != null) {
//      int leftSize = iter.left != null ? iter.left.size : 0;
//      if (leftSize + 1 < k) { // k-th node must be in right subtree of iter.
//        k -= (leftSize + 1);
//        iter = iter.right;
//      } else if (leftSize == k - 1) { // k-th is iter itself.
//        return iter;
//      } else { // k-th node must be in left subtree of iter.
//        iter = iter.left;
//      }
//    }
//    // If k is between 1 and the tree size, this line is unreachable .
//    return null;
//  }
}
