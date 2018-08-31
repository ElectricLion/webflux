package lambda;

/**
 * @Author:tanghui
 * @Date:2018/8/31 14:29
 */
public class LambdaThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程创建成功");
            }
        }).start();

        //JAVA 8  函数式编程
        //lambda  返回一个指定接口的对象实例。区分带参、无参、有返回值，无返回值。方法的输入和输出
        Runnable runnable = () -> System.out.println(Thread.currentThread().getName() + "线程创建成功");
        new Thread(runnable).start();
    }
}
