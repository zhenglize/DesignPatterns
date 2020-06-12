package 责任链模式.chain1;

public abstract class BaseTask {
    //判断当前的节点是否有能力执行任务
    boolean isTask;
    public BaseTask(Boolean isTask){
        this.isTask=isTask;
    }
    //添加下一个任务到链条的后面
    BaseTask nextTask;
    public void addNextTask(BaseTask baseTask){
        this.nextTask=baseTask;
    }
    public abstract void doAction();
    public void action(){
        //如果该节点有能力执行则直接执行
        if (isTask){
            doAction();
        }else {
            //若该节点没有能力执行,把任务交给下一个节点
            if (nextTask !=null){
                nextTask.action();
            }
        }
    }
}
