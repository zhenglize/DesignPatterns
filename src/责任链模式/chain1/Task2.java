package 责任链模式.chain1;

public class Task2 extends BaseTask {
    public Task2(Boolean isTask) {
        super(isTask);
    }

    @Override
    public void doAction() {
        System.out.println("节点2执行了任务！！！");
    }
}
