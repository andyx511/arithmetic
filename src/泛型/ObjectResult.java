package 泛型;

/**
 * @author NiDingbo
 * @date 2020/1/9
 * @des
 */
public class ObjectResult<T> {
    private T obj;
    public T getObj(){
        return obj;
    }
    public void setObj(T obj){
        this.obj = obj;
    }

}
