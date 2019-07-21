package jvm.classLoad;

/**
 * @author YanQiKing
 * @date 2019/7/19 22:05
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Child.str);
    }
}


class Parent {
    public static String str = "hello";
    static {
        System.out.println("parent static clock");
    }
}


class Child extends Parent{
    public static String str2 = "welcome";
    static {
        System.out.println("child static clock");
    }
}