package algorithm.java.easy.twoSum;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1.两数之和
 */
public class Solution {

  public static void main(String[] args) {
    //test data
    int[] nums = new int[]{2, 7, 11, 15};
    int target = 9;
    System.out.println(Arrays.toString(twoSum(nums, target)));

  }

  private static int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> map = new HashMap<>(16);

    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        return new int[]{map.get(nums[i]), i};
      } else {
        map.put(target - nums[i], i);
      }
    }

    return new int[]{0, 0};

  }

}
