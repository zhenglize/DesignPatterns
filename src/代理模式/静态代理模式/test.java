package 代理模式.静态代理模式;

public class test {
    public static void main(String[] args) {
        new TankLoggedProxy(
                new TankTimeProxy(new Tank()))
                .move();
    }
}
