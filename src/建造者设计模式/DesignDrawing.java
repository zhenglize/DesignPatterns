package 建造者设计模式;
/**
*@author zhenglize
  设计师设计的图纸
*/
public class DesignDrawing {
    //房子图纸有三个属性，高、宽和颜色，颜色默认为白色
    private double height;
    private double width;
    private String color="白色";
    public DesignDrawing(){
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "DesignDrawing{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}
