package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author:tanghui
 * @Date:2018/8/31 15:44
 */
public class varDemo {
    public static void main(String[] args) {
        //当lambda表达式引入外部变量的时候，属于值传递，不是引入传递。外部变量必须是不可以修改的，也就是final的。防止lambda内部引用的变量值和外部的变量值不一样，出现二义性。
        List<String> list = new ArrayList<>();
        list.add("");
        String string = "";
        Consumer<String> consumer = s -> System.out.println(s + list);
        consumer.accept("1");
    }
}
