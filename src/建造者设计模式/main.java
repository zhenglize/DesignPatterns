package 建造者设计模式;
/**
*@author zhenglize
  模拟用户找设计师盖房子的过程，使用了建造者模式，避免了重复修改所带来的开销
*/
public class main {
    public static void main(String[] args) {
        //用户指定房子的大小颜色，盖房子
        DesignerPerson01 designerPerson01 =new DesignerPerson01();
        designerPerson01.addHeight(100.0);
        designerPerson01.addWidth(50.0);
        designerPerson01.addColor("红色");
        //建造出来的房子
        House house = designerPerson01.buildHouse();
        System.out.println(house);
        /**
           print : 实际建造出来的房子》》》》》House{height=100.0, width=50.0, color='红色'}
        */
        System.out.println("=================================");
        System.out.println("=================================");
        System.out.println("=================================");
        //模仿类似于okhttp的链式调用
        House house2=new DesignerPerson02()
                .addColor("黑色")
                .addHeight(30.0)
                .addWidth(40.0).buildHouse();
        System.out.println(house2);
        /**
         print 实际建造出来的房子》》》》》House{height=30.0, width=40.0, color='黑色'}
        */
    }
}
