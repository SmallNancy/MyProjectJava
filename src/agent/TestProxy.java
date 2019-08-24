package agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author YanQiKing
 * @date 2019/8/24 21:02
 * 动态代理类
 */

//动态代理的使用
interface Subject{
    void action();
}

//被代理类


 class RealSubject  implements Subject{
    @Override
    public void action() {
        System.out.println("我是被代理类");
    }
}

class MyInvocationHandler implements InvocationHandler {

    Object obj;
    public Object blind (Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = method.invoke(obj,args);
        return res;
    }
}
public class TestProxy{
    public static void main(String[] args) {
        RealSubject real = new RealSubject();
        MyInvocationHandler handle = new MyInvocationHandler();
        Object obj = handle.blind(real);
        Subject sub = (Subject) obj;
        sub.action();
    }

}