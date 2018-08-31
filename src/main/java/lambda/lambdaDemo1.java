package lambda;

/**
 * @Author:tanghui
 * @Date:2018/8/31 14:50
 */
@FunctionalInterface
interface Interface1 {
    /**
     * 每个方法，默认将当前对象作为参数传入道方法中
     *
     * @param i
     * @return
     */
    int doubleNum(int i);

    /**
     * JAVA 8 新特性默认实现方法 接口也可以有实现方法
     *
     * @param x
     * @param y
     * @return
     */
    default int add(int x, int y) {
        return x + y;
    }
}

@FunctionalInterface
interface Interface2 {
    /**
     * 每个方法，默认将当前对象作为参数传入道方法中
     *
     * @param i
     * @return
     */
    int doubleNum(int i);

    /**
     * JAVA 8 新特性默认实现方法 接口也可以有实现方法
     *
     * @param x
     * @param y
     * @return
     */
    default int add(int x, int y) {
        return x + y;
    }
}

interface Interface3 extends Interface1, Interface2 {


    @Override
    default int add(int x, int y) {
        return 0;
    }
}

public class lambdaDemo1 {
    public static void main(String[] args) {
        //lambda 的写法。使用lambda 来返回指定接口的对象实例时，要保证只有该接口只有一个要实现的抽象方法。default 默认实现方法不包含在内。
        //lambda 表达式不关心接口名是什么，方法名是什么。只关心方法的输入，和输出也就是返回值。
        Interface1 interface1 = i -> i * 2;  //单行有默认return
        Interface1 interface2 = i -> {
            return i * 2;
        };
        Interface1 interface3 = (i) -> i * 2;
        Interface1 interface4 = (int i) -> i * 2;
    }
}


