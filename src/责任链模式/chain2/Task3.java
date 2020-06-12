package 责任链模式.chain2;

public class Task3 implements IBaseTask {
    @Override
    public void doRunAction(String isTask, IBaseTask iBaseTask) {
        if ("ok".equals(isTask)){
            System.out.println("节点3执行了任务。。。");
            return;
        }else {
            iBaseTask.doRunAction(isTask, iBaseTask);
        }
    }
}
