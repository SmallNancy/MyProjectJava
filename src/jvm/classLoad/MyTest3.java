package jvm.classLoad;

import java.util.UUID;

/**
 * @author YanQiKing
 * @date 2019/7/20 10:11
 */
public class MyTest3 {
    public static void main(String[] args) {
        Parent3 p = new Parent3();  // 主动使用，静态代码块输出
     // System.out.println(Parent3.str);
        System.out.println("=============");
        Parent3[] pp = new  Parent3[1]; // 被动使用，静态代码块不输出

        int[] arr = new int[1];
        System.out.println(arr.getClass());
        int[][] arr2 = new int[1][1];
        System.out.println(arr2.getClass());
        boolean[] booleans = new boolean[1];
        System.out.println(booleans.getClass());
        byte[] bytes = new byte[1];
        System.out.println(bytes.getClass());
    }
}
class Parent3{
    //public static final String str = UUID.randomUUID().toString();
    static {
        System.out.println("hello static 3");
    }
}
