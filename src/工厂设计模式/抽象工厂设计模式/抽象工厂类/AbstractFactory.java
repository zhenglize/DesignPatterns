package 工厂设计模式.抽象工厂设计模式.抽象工厂类;
/**
*@author zhenglize
  抽象工厂类
*/
public abstract class AbstractFactory {
      public abstract Food createBread();
      public abstract Weapon createAK47();
      public abstract Vehicle createCar();
}
