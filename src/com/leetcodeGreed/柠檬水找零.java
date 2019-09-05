package com.leetcodeGreed;

/**
 * @author YanQiKing
 * @date 2019/9/5 9:31
 * 贪心--柠檬水找零 leetcode 860
 */
public class 柠檬水找零 {
    public boolean lemonadeChange(int[] bills) {
        int numFive = 0;
        int numTen = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                numFive++;
            }else if (bills[i] == 10) {
                numTen++;
                if (numFive > 0) {
                    numFive--;
                }else {
                    return false;
                }
            }else {
                if (bills[i] != 0) {
                    if (numTen > 0) {
                        bills[i] -= 10;
                        numTen--;
                    }
                    while (bills[i] > 5 && numFive > 0) {
                        bills[i] -= 5;
                        numFive--;
                    }
                    if (bills[i] > 5)
                        return false;
                }
            }
        }
    return true;
    }

}
