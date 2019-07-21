package jvm.classLoad;

/**
 * @author YanQiKing
 * @date 2019/7/19 22:26
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(Parent2.str);
        System.out.println("-----------");
        System.out.println(heel.str);
    }
}
class Parent2 {
    public static String str = "hello";
    static {
        System.out.println("parent static clock");
    }
}
class heel {
    public static final String  str = "hello";
    static {
        System.out.println("parent static clock");
    }
}