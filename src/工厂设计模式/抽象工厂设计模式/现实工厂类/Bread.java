package 工厂设计模式.抽象工厂设计模式.现实工厂类;

import 工厂设计模式.抽象工厂设计模式.抽象工厂类.Food;

public class Bread extends Food {
    @Override
    public void eat() {
        System.out.println("吃面包~~~");
    }
}
