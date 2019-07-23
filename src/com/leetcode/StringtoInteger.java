package com.leetcode;

import javax.xml.transform.Source;

/**
 * @author YanQiKing
 * @date 2019/7/23 21:30
 */
public class StringtoInteger {
    public static void main(String[] args) {
        String str = " -423454556568989";
        System.out.println(myAtoi(str));
    }
    public static int myAtoi(String str) {
        str = str.trim();
        char[] c = str.toCharArray();
        if (c.length == 0) {
            return 0;
        }
        int index = 1;
        int i = 0;
        if (c[0] == '-') {
            index = -1;
            i++;
        }else if (c[0] == '+') {
            i++;
        }else if (!(c[0] >= '0' && c[0] <= '9')) {
            return 0;
        }
        long result = 0;
        while (i < c.length && c[i] >= '0' && c[i] <= '9') {
            result = result * 10 + (c[i] - '0');
            i++;
            if(result > Integer.MAX_VALUE){
                if (index == 1) {
                    if(result > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                } else {
                    return Integer.MIN_VALUE;
                }
            }
        }
        return  index * (int)result;

    }
}
