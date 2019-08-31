package Interview;

import java.sql.SQLOutput;

/**
 * @author YanQiKing
 * @date 2019/8/31 10:08
 */
public class EightLock {
    public static void main(String[] args) {
        Number number = new Number();
        Number number2 = new Number();
        new Thread(new Runnable() {
            @Override
            public void run() {
                number.getOne();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                number2.getTwo();
            }
        }).start();
    }
}

class Number{
    public  synchronized  void  getOne(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("one");
    }

    public   synchronized void getTwo() {
        System.out.println("two");
    }

}
