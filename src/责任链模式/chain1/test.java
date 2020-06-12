package 责任链模式.chain1;
/**
*@author zhenglize
 责任链模式，一条链若某一节点有能力执行任务则直接返回，否则到最后一个节点才返回
*/
public class test {
    public static void main(String[] args) {
        //声明四个节点
        Task1 t1=new Task1(false);
        Task2 t2=new Task2(false);
        Task3 t3=new Task3(true);
        Task4 t4=new Task4(false);
        //把他们穿成一条链
        t1.addNextTask(t2);
        t2.addNextTask(t3);
        t3.addNextTask(t4);
        //执行任务
        t1.action();
        /**
         由于t3是true，说明t3有能力执行任务，返回true
         节点3执行了任务！！！
        */
    }
}
