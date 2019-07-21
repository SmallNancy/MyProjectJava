package com.leetcode;

/**
 * @author YanQiKing
 * @date 2019/7/21 15:42
 */
public class CountandSay38 {
    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        StringBuilder result = new StringBuilder();
        StringBuilder last = new StringBuilder("1");// 记录上一个的状态
        for (int i = 2; i <= n;i++) {
            char c = last.charAt(0);
            int count = 1;
            result = new StringBuilder(""); // 初始化为空
            for (int j = 1;j < last.length();j++) {
                char x = last.charAt(j);
                if (c == x) {
                    count++;
                    continue;
                }else {
                    result.append(count).append(c);
                    c = x;
                    count=1;
                }
            }
            result.append(count).append(c);
            last = result;
        }
        return result.toString();

    }
}
