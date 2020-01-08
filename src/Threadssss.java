/**
 * @author NiDingbo
 * @date 2019/11/19
 * @des
 */
public class Threadssss {

    public static void main(String [] ages){
        Person person = new Person();

        Producer producer = new Producer(person);

        Consumer consumer = new Consumer(person);
        producer.run();
        consumer.run();
    }



}
