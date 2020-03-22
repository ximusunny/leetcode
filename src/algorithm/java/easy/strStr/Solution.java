package algorithm.java.easy.strStr;

public class Solution {

    public static void main(String[] args) {
        //String haystack = "hello", needle = "ll";
        //String haystack = "aaaaa", needle = "bba";
        String haystack = "a", needle = "";
        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        //每次取出haystack比较的长度是needle的长度
        //最大的比较次数为：haystack.length()-needle.length()
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

}
