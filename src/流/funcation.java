package 流;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author NiDingbo
 * @date 2020/1/9
 * @des
 *  流的基本操作
 */
public class funcation {
    public static void main(String []args){

        // todo 过滤
       /* List<String> words = Arrays.asList("wmyskxz", "say", "wow", "to", "everybody");
        words.stream()
                .filter(word -> word.startsWith("w"))
                .forEach(System.out::println);*/

        //todo  过滤输出一个集合 collect
        /*List<String> words = Arrays.asList("wmyskxz", "say", "wow", "to", "everybody");
        List<String> filteredWords = words.stream()
                .filter(word -> word.startsWith("w"))
                .collect(Collectors.toList());
        filteredWords.stream().forEach(System.out::println);*/

        //todo 去重 distinct
        /*List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 2, 1, 3, 4);
        numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .distinct()
                .forEach(System.out::println);*/

        //todo 限制 limit（返回不超过定长的流） skip（返回去掉前n个的流）
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numbers.stream()
                .limit(3)
                .forEach(System.out::println);
        numbers.stream()
                .skip(2)
                .forEach(System.out::println);*/

        //todo 映射 map
        /*List<Words> numbers = Arrays.asList(new Words("我没有三颗心脏"),
                new Words("公众号"), new Words("wmyskxz"));
        numbers.stream()
                .map(Words::getContents)
                .forEach(System.out::println);
        //todo 想要获取 对象内的String的长度
        numbers.stream()
                .map(Words::getContents)
                .map(String::length)
                .forEach(System.out::println);*/
        /*
        *
        *  todo flatMap：流的扁平化
            你已经看到我们是如何使用 map
            *  方法来返回每个 Words 的具体长度了，
            * 现在让我们来扩展一下：
            * 对于一个 Words 集合，
            * 我需要知道这个集合里一共有多少个不相同的字符呢？
            * 例如，给定单词列表为：["Hello", "World"]，则需要返回的列表是：["H", "e", "l", "o", "W", "r", "d"]。
        * */
        // 错误版本
        // 原因
        // 传递给 map 方法的 lambda 表达式为每个单词返回了一个 String[]，
        // 所以经过 map 方法之后返回的流就不是我们预想的 Stream<String>，而是 Stream<String[]>
        // 图 ： https://mmbiz.qpic.cn/mmbiz_png/ia1kbU3RS1H6E0zvkkmQ8KqrIibdnYyhsRQZQTsLcjWeCbzm6qJ41G8PMGiaiaibfT3eLDc0jiczGntHCZsF6L0PGtCQ/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1
        /*List<String> words = Arrays.asList("Hello", "World");
        words.stream()
                .map(s -> s.split(""))
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        // 正确版本
        // 图：https://mmbiz.qpic.cn/mmbiz_png/ia1kbU3RS1H6E0zvkkmQ8KqrIibdnYyhsRJ1uOj4vu6XzRILx7bCJ7aBRSRLTgtsWS8icCbplr7OrH2x9NwActEmA/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1
        /*List<String> words = Arrays.asList("Hello", "World");
        words.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        // todo 查找与匹配
        /*
        字面意思
        * allMatch
        * anyMatch
        * noneMatch
        * findFirst
        * findAny
         * */
       /* List<Integer> numbers = Arrays.asList(1, 2, 3);
        if (numbers.stream().anyMatch(i -> i % 2 == 0)) {
            System.out.println("集合里有偶数!");
        }*/
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Optional<Integer> firstSquareDivisibledByThree =
                numbers.stream()
                        .map(x -> x * x)
                        .filter(x -> x % 3 == 0)
                        .findFirst();
        System.out.println(firstSquareDivisibledByThree.get());*/
        /*
        * todo Optional 简介：
            Optional<T> 类是 java.util.Optional 包里的一个容器类，
            * 代表一个值存在或者不存在。在上面的代码中，findFirst()
            * 可能什么元素都找不到，Java 8 的设计人员引入了 Optional<T>，
            * 这样就不用返回众所周知容易出问题的 null 了。
            * 我们在这里不对 Optional 做细致的讨论。*/

        // todo 归约 reduce
        // 一个初始值，这里是 0；
        //一个是 BinaryOperator 来将两个元素结合起来产生一个新值，这里我们用的是 lambda (a, b) -&gt; a + b；
        // 图： https://mmbiz.qpic.cn/mmbiz_png/ia1kbU3RS1H6E0zvkkmQ8KqrIibdnYyhsRm5nPic1CxkSgbkVfNR8tQmlTvXbuarO5Cmw0C4cbnH59HtHkAXxmsFQ/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1
//        List<Integer> numbers = Arrays.asList(1, 3, 2, 4, 5);
        // int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        //int sum = numbers.stream().reduce(0, Integer::sum);
//        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
//        Optional<Integer> max = numbers.stream().reduce(Integer::max);
//        System.out.println(max.get());
//        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        // todo 中间操作和结束操作
        /*
        * stream的所有操作分为两类
        *   中间操作
        *   结束操作
        * 中间操作分为有状态的和无状态的
        *   无状态的中间操作是指元素的处理不受前面元素的影响
        *   有状态的中间操作必须等到所有元素处理之后才能知道最终结果，
        *       比如排序是有状态操作，在读取所有元素之前并不能确定排序结果
        *  结束操作分为短路操作和非短路操作
        *   短路操作是指不用处理全部元素就可以返回结果
        *       比如找到第一个满足条件的元素
        *   之所以要进行如此精细的划分，是因为底层对每一种情况的处理方式不同
        *   图：https://mmbiz.qpic.cn/mmbiz_png/ia1kbU3RS1H6E0zvkkmQ8KqrIibdnYyhsR9ktmmncS8iaUvQvBazianIibbysxeC4TIx8V03rJbh6A80ZImrdnficfOw/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1
        * */
        /*IntStream.range(1, 10)
                .peek(x -> System.out.print("\nA" + x))
                .limit(3)
                .peek(x -> System.out.print("B" + x))
                .forEach(x -> System.out.print("C" + x));*/
        /*
        * 中间操作是懒惰的，
        * 也就是不会对数据做任何操作，
        * 直到遇到了结束操作。而结束操作都是比较热情的，他们会回溯之前所有的中间操作。

        拿上面的例子来说，
        * 当执行到 forEach() 的时候，它会回溯到上一步中间操作，
        * 再到上一步中间操作，再上一步..直到第一步，
        * 也就是这里的 .peek(x -> System.out.println("\nA" + x)，
        * 然后开始自上而下的依次执行，输出第一行的 A1B1C1，
        * 然而第二次执行 forEach() 操作的时候等同，以此类推..
        * */

       /* IntStream.range(1, 10)
                .peek(x -> System.out.print("\nA" + x))
                .skip(6)
                .peek(x -> System.out.print("B" + x))
                .forEach(x -> System.out.print("C" + x));*/
        /*
        * 根据上面介绍的规则，
        * 同样的当第一次执行 .forEach() 的时候，
        * 会回溯到第一个 peek 操作，打印出 A1，然后执行 skip
        * ，这个操作的意思就是跳过，也就是相当于 for 循环里面的 continue
        * ，所以前六次的 forEach() 操作都只会打印 A。

        而第七次开始，skip 失效之后，
        * 就会开始分别执行 .peek() 和 forEach() 里面的打印语句了，
        * 就会看到输出的是：A7B7C7。
        * */


    }



    private static class Words{

        private String contents;

        private Words(String contents){
            this.contents = contents;
        }
        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

    }
}
