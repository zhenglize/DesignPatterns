package 责任链模式.chain2;

public class Task2 implements IBaseTask {
    @Override
    public void doRunAction(String isTask, IBaseTask iBaseTask) {
        if ("no".equals(isTask)){
            System.out.println("节点2执行了任务。。。");
            return;
        }else {
            iBaseTask.doRunAction(isTask, iBaseTask);
        }
    }
}
