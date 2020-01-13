package 泛型;

/**
 * @author NiDingbo
 * @date 2020/1/9
 * @des
 */
public class fan {
    public static void main(String []args){
        ObjectResult<String> objectResult = new ObjectResult<>();
        objectResult.setObj("sdadsad");
        String s = objectResult.getObj();
        System.out.println(s);
    }

}
