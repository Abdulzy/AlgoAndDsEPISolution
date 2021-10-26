package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//USE list
public class intersectionOfTwoArrays {
  public int[] intersection(int[] nums1, int[] nums2) {
    List<Integer> one = new ArrayList<>();
    List<Integer> two = new ArrayList<>();
    for (Integer val:nums1   ) {
      one.add(val);
    }

    for (Integer val:nums2   ) {
      two.add(val);
    }

    if(one.size() > two.size()){
      return helper(two,one);
    }
    else
      return helper(one,two);
  }

  public int[] helper(List<Integer> shorter, List<Integer> longer){
    int[] result = new int[shorter.size()];
    int count =0;
    for (Integer val: shorter ) {
      if(longer.contains(val)){
        result[count++] = val;
      }
    }
    return result;
  }

}
