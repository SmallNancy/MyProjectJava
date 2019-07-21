package jvm.classLoad;

/**
 * @author YanQiKing
 * @date 2019/7/20 11:21
 */
public class MyTest6 {
    public static void main(String[] args) {
        Singlton singlton = Singlton.getInstance();
        System.out.println(singlton.a1);
        System.out.println(singlton.a2);
    }
}

class Singlton {
    public static int a1;
    private static Singlton singlton = new Singlton();
    private Singlton(){
        a1++;
        a2++;
    }
    public static int a2 = 0;
    public static Singlton getInstance(){
        return singlton;
    }
}
