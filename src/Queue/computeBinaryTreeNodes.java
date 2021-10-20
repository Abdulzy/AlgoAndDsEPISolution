package Queue;

import scoring.scoring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class computeBinaryTreeNodes {
  //HAD A SOLUTION IN MIND THAT LEETCODE AGREED WITH, COULDN'T IMPLEMENT

//  public static List<List<Integer>> solution(BinaryTreeNode<Integer> tree) {
//    Queue<BinaryTreeNode<Integer>> currDepthNodes = new LinkedList<>();
//    currDepthNodes.add(tree);
//    List<List<Integer>> result = new ArrayList<>();
//    while (!currDepthNodes.isEmpty()) {
//      Queue<BinaryTreeNode<Integer>> nextDepthNodes = new LinkedList<>();
//      List<Integer> thisLevel = new ArrayList<>();
//      while (!currDepthNodes.isEmpty()) {
//        BinaryTreeNode<Integer> curr = currDepthNodes.poll();
//        if (curr != null) {
//          thisLevel.add(curr.data);
//// Defer the null checks to the null test above.
//          nextDepthNodes.add(curr.left);
//          nextDepthNodes.add(curr.right);
//        }
//      }
//      if (!thisLevel.isEmpty()) {
//        result.add(thisLevel);
//      }
//      currDepthNodes = nextDepthNodes;
//    }
//    return result;
//  }
//
//
//    public static void main(String[] args) {
//    int index = 2;
//    System.out.println((solution(index)));
//    System.out.println(scoring.scoreSolution(0,0,0,0));
//  }
}
