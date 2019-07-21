package jvm.classLoad;

import java.util.Random;

/**
 * @author YanQiKing
 * @date 2019/7/20 11:03
 */
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(Leaf.b);
    }
}

interface Root {
    public static final  int a = 4;
}
interface Leaf extends Root {
    public static final int b = new Random().nextInt(4);
    //int b = 6;
}
