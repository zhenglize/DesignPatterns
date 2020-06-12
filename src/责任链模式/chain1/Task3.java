package 责任链模式.chain1;

public class Task3 extends BaseTask {
    public Task3(Boolean isTask) {
        super(isTask);
    }

    @Override
    public void doAction() {
        System.out.println("节点3执行了任务！！！");
    }
}
