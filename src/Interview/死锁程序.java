package Interview;

/**
 * @author YanQiKing
 * @date 2019/8/23 21:08
 */
public class 死锁程序 {
    static StringBuilder sb1 = new StringBuilder();
    static StringBuilder sb2 = new StringBuilder();
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                synchronized (sb1) {
                    sb1.append("aa");
                    try {
                        Thread.currentThread().sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (sb2) {
                        sb2.append("bb");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                synchronized (sb2) {
                    sb2.append("CC");
                    try {
                        Thread.currentThread().sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (sb1) {
                        sb2.append("dd");
                    }
                }
            }
        }.start();



    }
}
