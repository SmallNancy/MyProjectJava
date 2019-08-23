package Interview;

import jvm.classLoad.Test;

/**
 * @author YanQiKing
 * @date 2019/8/23 21:11
 */
public class 生产者消费者 {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        Producter p1 = new Producter(c);
        Customer c1 = new Customer(c);
        Thread t1 = new Thread(p1);
        Thread t3 = new Thread(c1);
        Thread t2 = new Thread(p1);
        t1.setName("生产者1");
        t2.setName("生产者2");
        t3.setName("消费者");
        t1.start();
        t2.start();
        t3.start();
    }

}

class Clerk {  // 店员控制生产消费这两个线程
    int product;
    public synchronized void  addProduct() {
        if (product > 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            product++;
            System.out.println("生产" + product + "产品");
            notify();
        }

    }
    public synchronized void  ConsumeProduct() {
        if (product <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("消耗了" + product + "产品");
            product--;
            notify();
        }

    }
}


class Producter implements Runnable {
    Clerk clerk;

    public Producter(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            clerk.addProduct();
            System.out.println(Thread.currentThread().getName());
        }

    }
}

class Customer implements Runnable {
    Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }
    @Override
    public void run() {
        while (true) {
            clerk.ConsumeProduct();
            System.out.println(Thread.currentThread().getName());
        }

    }
}