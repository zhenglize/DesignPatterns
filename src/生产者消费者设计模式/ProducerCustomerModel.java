package 生产者消费者设计模式;

import java.util.LinkedList;
import java.util.List;

/**
*@author zhenglize
  生产者消费者设计模式
*/
public class ProducerCustomerModel {
    public static void main(String[] args) {
        Storage storage=new Storage(10);
        Producer producer=new Producer(storage);
        Customer customer=new Customer(storage);
        Thread pro=new Thread(producer);
        Thread cus=new Thread(customer);
        pro.start();
        cus.start();
    }
}
class Producer implements Runnable{
    Storage storage;
    public Producer(Storage storage){
        this.storage=storage;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            storage.put(i);
        }
    }
}
class Customer implements Runnable{
    Storage storage;
    public Customer(Storage storage){
        this.storage=storage;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            storage.take();
        }

    }
}
//维护一个仓库，当有空位置提醒生产者生产，当没有位置让生产者停止生产，同理当队列为空消费者停止消费
class Storage{
    LinkedList<Integer> list;
    int maxSize;
    public Storage(int maxSize){
        this.maxSize=maxSize;
        list=new LinkedList<Integer>();
    }
    public synchronized void put(int data){
        //队列满了让生产者停止生产
        while (list.size() == maxSize){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(data);
        System.out.println("队列中有"+list.size()+"个元素");
        //有商品了唤醒消费者线程
        notify();
    }
    public synchronized void take(){
        //队列空了让消费者停止消费
        while (list.size() == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者消费了"+ list.poll()+"数据，队列中有"+list.size()+"个元素");
        //有商品了唤醒消费者线程
        notify();
    }
}
