package 建造者设计模式;
/**
*@author zhenglize
    用户找的设计师
*/
public class DesignerPerson01 {
    DesignDrawing designDrawing;
    Worker worker;
    public DesignerPerson01(){
        designDrawing=new DesignDrawing();
        worker=new Worker();
    }
    //用户添加房子的长宽以及颜色
    public void addHeight(double height){
        designDrawing.setHeight(height);
    }
    public void addWidth(double width){
        designDrawing.setWidth(width);
    }
    public void addColor(String color){
        designDrawing.setColor(color);
    }
    //交工给用户，返回工人建造房子
    public House buildHouse(){
        return worker.build(designDrawing);
    }
}
