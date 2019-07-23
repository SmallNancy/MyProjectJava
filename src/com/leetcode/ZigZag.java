package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/7/23 21:18
 */
public class ZigZag {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows;i++) {
            sb[i] = new StringBuilder();
        }
        int i = 0;
        int len = s.length();
        while (i < len) {
            for (int index = 0; index < numRows;index++) {
                sb[index].append(c[i++]);  //up tp down
            }
            for (int index = numRows - 2;index > 0 && i < len;index--) {
                sb[index].append(c[i++]);  //down to up
            }

        }
        for (int j = 1; j < numRows && i < len;j++) {
            sb[0].append(sb[i]);
        }
        return sb[0].toString();

    }
}
