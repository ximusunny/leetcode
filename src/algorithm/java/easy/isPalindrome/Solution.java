package algorithm.java.easy.isPalindrome;

/**
 * 9. 回文数
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class Solution {

  public static void main(String[] args) {
    int x = 789;
    System.out.println(isPalindrome(x));
  }

  private static boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    int save = x;
    int re = 0;
    while (save != 0) {
      re = save % 10 + 10 * re;
      save = save / 10;
    }

    return re == x;
  }

  /**
   * 此方法效率低下、内存消耗较大
   */
  private static boolean reverse02(int x) {
    String str = String.valueOf(x);
    return str.equals(new StringBuilder(str).reverse().toString());
  }

}
