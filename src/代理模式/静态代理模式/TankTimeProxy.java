package 代理模式.静态代理模式;
/**
*@author zhenglize
  Tank时间的代理对象
*/
public class TankTimeProxy implements Movable{
    Movable m;
    public TankTimeProxy(Movable m){
        this.m=m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end =System.currentTimeMillis();
        System.out.println("记录的日志时间为:"+(end-start));
    }
}
