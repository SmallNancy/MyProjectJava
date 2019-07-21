package jvm.classLoad;

import javax.xml.transform.Source;

/**
 * @author YanQiKing
 * @date 2019/7/20 12:51
 */
public class MyTest7 {
    public static void main(String[] args) {
        new Demo();
        new Demo();
    }
}
class Demo {

    static {
        System.out.println("static clock"); //加载一次
    }
    {
        System.out.println("hello"); // 每创建一个实例，加载一次
    }
    public Demo(){
        System.out.println("Demo");
    }
}
