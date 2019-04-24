package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Sum {
  public static void main(String[] args) {
    int a[] = {3,2,4};
    int b[] = {2,7,11,15};

    int targetA = 6;
    int targetB = 9 ;

//    int [] results = twoSum(a, targetA);
    int[] results = twoSum(b, targetB);

    for(int result : results){
      System.out.println(result);
    }
  }

    public static int[] twoSum(int[] nums, int target) {
      List list = new ArrayList();
      int[] result = new int[2];

      for(int i = 0 ; i < nums.length ; i++){
        int complement = Math.abs(target - nums[i]);

        if(list.contains(complement)){
          result[0] = list.indexOf(complement);
          result[1] = i;

          return result;
        } else {
          list.add(nums[i]);

          System.out.println(list.toString());
        }
      }
      return result;
    }
}
