package algorithm.java.easy.reverse;

/**
 * 7.整数反转
 */
public class Solution {

  public static void main(String[] args) {

    int x = 789;
    System.out.println(reverse01(x));

  }

  private static int reverse01(int x) {
    //反转后的数
    long res = 0;

    while (x != 0) {
      res = res * 10 + x % 10;
      x /= 10;
    }

    //return (int) res == res ? (int) res : 0;
    //or
    return (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) ? 0 : (int) res;
  }

}
