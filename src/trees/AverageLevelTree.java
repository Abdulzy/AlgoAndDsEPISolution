package trees;

import java.util.ArrayList;
import java.util.List;

public class AverageLevelTree {
  List<Double> average = new ArrayList<>();
  List<Integer> count = new ArrayList<>();
  public List<Double> averageOfLevels(TreeNode root) {
    int count = 0;

    averagehelper(root,count);
    return average;
  }

  public void averagehelper(TreeNode root, int index){
    if(root == null){
      return;
    }
    int math = average.size();
    if(index < average.size()){
      double val = average.get(index) * count.get(index);
      val = val + root.val;
      int temp = count.get(index) + 1;
      val = val/temp;
      average.set(index,val);
      count.set(index,temp);
    }else{
      double num = root.val;
      average.add(index,num);
      count.add(index,1);
    }
    averagehelper(root.left,index + 1);
    averagehelper(root.right,index + 1);
  }
}
