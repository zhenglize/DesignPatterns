package 工厂设计模式.抽象工厂设计模式.现实工厂类;

import 工厂设计模式.抽象工厂设计模式.抽象工厂类.Weapon;

public class AK47 extends Weapon {
    @Override
    public void shoot() {
        System.out.println("AK47 TUUTUTUTU~~~`");
    }
}
