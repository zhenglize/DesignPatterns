package 建造者设计模式;
/**
*@author zhenglize
  实际建造房子的工人
*/
public class Worker {
    House house;
    public Worker(){
      house=new House();
    }
    //拿着图纸盖房子
    public House build(DesignDrawing designDrawing){
      house.setColor(designDrawing.getColor());
      house.setWidth(designDrawing.getWidth());
      house.setHeight(designDrawing.getHeight());
      return house;
    }
}
