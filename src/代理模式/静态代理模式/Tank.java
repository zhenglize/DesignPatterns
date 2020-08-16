package 代理模式.静态代理模式;

import java.util.Random;

public class Tank implements Movable {
    @Override
    public void move()  {
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("tank moving kakakkakakka~~~~");
    }
}
