/**
 * @author NiDingbo
 * @date 2020/1/8
 * @des
 */
public class Person {
    /*private String name;
    private int age;

    *//**
     * 生产数据
     * @param name
     * @param age
     *//*
    public synchronized  void push(String name, int age){
        this.name = name;
        try{
           Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.age = age;
    }

    *//**
     * 消费数据
     *
     *//*
    public synchronized  void pop(){
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.name + "----------" + this.age);
    }*/
    private String name;
    private int age;

    //表示共享资源对象是否为空，如果为 true，表示需要生产，如果为 false，则有数据了，不要生产
    private boolean isEmpty = true;
    /**
     * 生产数据
     * @param name
     * @param age
     */
    public synchronized void push(String name,int age){
        try {
            //不能用 if，因为可能有多个线程
            while(!isEmpty){//进入到while语句内，说明 isEmpty==false，那么表示有数据了，不能生产，必须要等待消费者消费
                this.wait();//导致当前线程等待，进入等待池中，只能被其他线程唤醒
            }

            //-------生产数据开始-------
            this.name = name;
            //延时代码
            Thread.sleep(10);
            this.age = age;
            //-------生产数据结束-------
            isEmpty = false;//设置 isEmpty 为 false,表示已经有数据了
            this.notifyAll();//生产完毕，唤醒所有消费者
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /**
     * 取数据，消费数据
     * @return
     */
    public synchronized void pop(){
        try {
            //不能用 if，因为可能有多个线程
            while(isEmpty){//进入 while 代码块，表示 isEmpty==true,表示为空，等待生产者生产数据，消费者要进入等待池中
                this.wait();//消费者线程等待
            }
            //-------消费开始-------
            Thread.sleep(10);
            System.out.println(this.name+"---"+this.age);
            //-------消费结束------
            isEmpty = true;//设置 isEmpty为true，表示需要生产者生产对象
            this.notifyAll();//消费完毕，唤醒所有生产者
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
