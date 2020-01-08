/**
 * @author NiDingbo
 * @date 2020/1/8
 * @des
 */
public class Consumer implements Runnable {

    Person person = null;

    public Consumer(Person person){
        this.person = person;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            person.pop();
        }
    }
}
