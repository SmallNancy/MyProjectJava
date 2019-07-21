package com.onlineCode;

/**
 * @author YanQiKing
 * @date 2019/7/14 11:11
 */
public class Demo02 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello  world ");
        System.out.println(replaceSpace(str));
    }
    public static String replaceSpace(StringBuffer str) {
        for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) == ' ') {
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();

    }
}
