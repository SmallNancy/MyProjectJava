package com.onlineCode;

/**
 * @author YanQiKing
 * @date 2019/7/14 15:24
 */
public class Demo07 {
    public int Fibonacci(int n) {
        if (n < 1)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int s1 = 1;
        int s2 = 1;
        for (int i = 3; i <= n; i++) {
            s2 = s1 + s2;
            s1 = s2 - s1;
        }
        return s2;

    }
}
