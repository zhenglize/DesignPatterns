package 工厂设计模式.抽象工厂设计模式.现实工厂类;

import 工厂设计模式.抽象工厂设计模式.抽象工厂类.AbstractFactory;
import 工厂设计模式.抽象工厂设计模式.抽象工厂类.Food;
import 工厂设计模式.抽象工厂设计模式.抽象工厂类.Vehicle;
import 工厂设计模式.抽象工厂设计模式.抽象工厂类.Weapon;

public class ModernFactory extends AbstractFactory {
    @Override
    public Food createBread() {
        return new Bread();
    }

    @Override
    public Weapon createAK47() {
        return new AK47();
    }

    @Override
    public Vehicle createCar() {
        return new Car();
    }
}
