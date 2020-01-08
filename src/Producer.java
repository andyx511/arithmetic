/**
 * @author NiDingbo
 * @date 2020/1/8
 * @des
 */
public class Producer implements Runnable{
    Person person = null;

    public Producer(Person person){
        this.person = person;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            if (i%2 == 0){
                person.push("ndb", 18);
            }else {
                person.push("lala", 22);
            }
        }
    }
}
