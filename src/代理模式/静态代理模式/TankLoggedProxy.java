package 代理模式.静态代理模式;
/**
*@author zhenglize
  Tank类的日志代理
*/
public class TankLoggedProxy implements Movable{
    Movable movable;
    public TankLoggedProxy(Movable movable){
        this.movable=movable;
    }
    @Override
    public void move() {
        System.out.println("TankProxy logging");
        movable.move();
        System.out.println("TankProxy  finished");
    }
}
