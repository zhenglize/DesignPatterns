package 责任链模式.chain1;

public class Task1 extends BaseTask {
    public Task1(Boolean isTasked){
        super(isTasked);
    }
    @Override
    public void doAction() {
        System.out.println("结点1执行了任务！！！");
    }
}
