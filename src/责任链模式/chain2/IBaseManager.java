package 责任链模式.chain2;

import java.util.ArrayList;
import java.util.List;

public class IBaseManager implements IBaseTask {
    //存放任务的列表
    private List<IBaseTask> list=new ArrayList<>();
     public void addTask(IBaseTask iBaseTask){
         list.add(iBaseTask);
     }
     private int index=0;
    @Override
    public void doRunAction(String isTask, IBaseTask iBaseTask) {
        if (list.isEmpty())
              return;
        if (index >= list.size())
              return;
        IBaseTask curTask=list.get(index);
        index++;
        curTask.doRunAction(isTask,iBaseTask);
    }
}
