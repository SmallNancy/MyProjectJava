package Interview;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author YanQiKing
 * @date 2019/8/31 9:34
 * 三个线程，顺序打印ABC
 */
public class AlternateDemo {
    public static void main(String[] args) {
        Alternate ad = new Alternate();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10;i++) {
                    ad.loopA(i);
                }

            }
        },"A").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10;i++) {
                    ad.loopB(i);
                }

            }
        },"B").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10;i++) {
                    ad.loopC(i);
                    System.out.println("==========================");
                }

            }
        },"C").start();
    }

}
class Alternate{
    private int number = 1;
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    /**
     * A
     * @param totalLoop
     */
    public void loopA(int totalLoop){
        lock.lock();
        try {
            // 1、判断
            if (number != 1) {
                condition1.await();
            }
            //2、打印
            for (int i = 1; i <= 5; i++){
                System.out.println(Thread.currentThread().getName() + "\t"+ i + "\t" + totalLoop);
            }
            //3、唤醒
            number = 2;
            condition2.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void loopB(int totalLoop){
        lock.lock();
        try {
            if (number != 2) {
                condition2.await();
            }
            for (int i = 0; i < 10;i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i + "\t" + totalLoop);
            }
            number = 3;
            condition3.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void loopC(int totalLoop){
        lock.lock();
        try {
            if (number != 3) {
                condition3.await();
            }
            for (int i = 0; i < 10;i++) {
                System.out.println(Thread.currentThread().getName() +"\t" + i + "\t" + totalLoop);
            }
            number = 1;
            condition1.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
