package 责任链模式.chain2;
/**
*@author zhenglize
 责任链模式第二个例子，类似于递归，一个调用一个
*/
public class test {
    public static void main(String[] args) {
        IBaseManager manager=new IBaseManager();
        manager.addTask(new Task1());
        manager.addTask(new Task2());
        manager.addTask(new Task3());

        manager.doRunAction("ok",manager);
    }
}
