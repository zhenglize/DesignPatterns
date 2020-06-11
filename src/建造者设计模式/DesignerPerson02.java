package 建造者设计模式;
/**
*@author zhenglize
    用户找的设计师
*/
public class DesignerPerson02 {
    DesignDrawing designDrawing;
    Worker worker;
    public DesignerPerson02(){
        designDrawing=new DesignDrawing();
        worker=new Worker();
    }
    //用户添加房子的长宽以及颜色
    public DesignerPerson02 addHeight(double height){
        designDrawing.setHeight(height);
        return this;
    }
    public DesignerPerson02 addWidth(double width){
        designDrawing.setWidth(width);
        return this;
    }
    public DesignerPerson02 addColor(String color){
        designDrawing.setColor(color);
        return this;
    }
    //交工给用户，返回工人建造房子
    public House buildHouse(){
        return worker.build(designDrawing);
    }
}
