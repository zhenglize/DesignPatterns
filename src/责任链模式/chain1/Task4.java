package 责任链模式.chain1;

public class Task4 extends BaseTask{
    public Task4(Boolean isTask) {
        super(isTask);
    }

    @Override
    public void doAction() {
        System.out.println("节点4执行了任务！！！");
    }
}
