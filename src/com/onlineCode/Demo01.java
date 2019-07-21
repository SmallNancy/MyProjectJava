package com.onlineCode;

/**
 * @author YanQiKing
 * @date 2019/7/14 9:43
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Demo01 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        System.out.println(arr.length + " " + arr[0].length);

    }
    public static boolean find3(int tartget,int[][] arr) {
        if (arr.length == 0 || arr == null){
            return false;
        }
        int row = arr.length;
        int cols = arr[0].length;
        int i,j;
        for (i = row - 1,j = 0;i >= 0 && j < cols;) {
            if (tartget == arr[i][j])
                return true;
            if (tartget > arr[i][j]) {
                j++;
                continue;
            }
            if (tartget < arr[i][j]) {
                i--;
                continue;
            }
        }
        return false;
    }

    // ① 暴力破解：遍历所有
    public static boolean Find(int target, int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (target == array[i][j])
                    return true;
            }
        }
        return false;

    }
    public boolean Find2(int target, int [][] array) {
       int x = array.length;
       int y = array[0].length;
       int i,j;
       for (i = x - 1,j = 0;i >= 0 && j < y;) {
           if (target == array[i][j]) {
               return true;
           }
           if (target < array[i][j]) {
               i--;
               continue;
           }
           if (target > array[i][j]) {
               j++;
               continue;    // 结束本次循环，继续下次
           }
       }
       return false;

    }
}
