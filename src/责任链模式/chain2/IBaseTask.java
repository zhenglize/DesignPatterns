package 责任链模式.chain2;

public interface IBaseTask {
    /**
     @param isTask 判断是否有能力执行该任务
     @param iBaseTask 传入实现该接口的实现类
    */
    public void doRunAction(String isTask,IBaseTask iBaseTask);
}
