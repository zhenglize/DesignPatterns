package 工厂设计模式.抽象工厂设计模式.现实工厂类;

import 工厂设计模式.抽象工厂设计模式.抽象工厂类.Vehicle;

/**
*@author zhenglize
  现实推展的车类
*/
public class Car extends Vehicle {
    @Override
    public void go() {
        System.out.println("汽车wuwuwu的跑~~~");
    }
}
