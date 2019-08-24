package agent;

/**
 * @author YanQiKing
 * @date 2019/8/24 20:50
 */

//接口
interface ClothFactory{
    void productCloth();
}

//实现类 被代理类
class NikeClothFactory implements ClothFactory {
    @Override
    public void productCloth() {
        System.out.println("nike 生产衣服");
    }
}

//代理类
 class ProxyFactory implements ClothFactory{

    ClothFactory cf;

    //传入实际的被代理类对象
    public ProxyFactory(ClothFactory cf) {
        this.cf = cf;
    }
    @Override
    public void productCloth() {
        System.out.println("代理费￥10000");
        cf.productCloth();
    }
}
public class TestProduct{
    public static void main(String[] args) {
        NikeClothFactory nick = new NikeClothFactory();
        ProxyFactory proxy = new ProxyFactory(nick);
        proxy.productCloth();
    }

}
