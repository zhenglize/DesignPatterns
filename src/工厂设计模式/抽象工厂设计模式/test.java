package 工厂设计模式.抽象工厂设计模式;

import 工厂设计模式.抽象工厂设计模式.抽象工厂类.AbstractFactory;
import 工厂设计模式.抽象工厂设计模式.抽象工厂类.Food;
import 工厂设计模式.抽象工厂设计模式.抽象工厂类.Vehicle;
import 工厂设计模式.抽象工厂设计模式.抽象工厂类.Weapon;
import 工厂设计模式.抽象工厂设计模式.现实工厂类.ModernFactory;
/**
*@author zhenglize
  抽象工厂用于扩展产品一族
*/
//测试类
public class test {
    public static void main(String[] args) {
        AbstractFactory factory=new ModernFactory();
        Food food= factory.createBread();
        Vehicle vehicle= factory.createCar();
        Weapon weapon= factory.createAK47();
        food.eat();
        vehicle.go();
        weapon.shoot();
        /**
         吃面包~~~
         汽车wuwuwu的跑~~~
         AK47 TUUTUTUTU~~~`
        */
    }
}
