package MultithreadedProgramming;

/**
 * Created by Dw.L on 2017/7/26.
 * RunnableNoe类实现类  测试类
 *
 */
public class RunnableNoeImp {

    public static void main(String[] args) {

        RunnableNoe runnableNoe1 = new RunnableNoe("线程一");
        RunnableNoe runnableNoe2 = new RunnableNoe("线程二");

        runnableNoe1.start();
        runnableNoe2.start();




    }
}
