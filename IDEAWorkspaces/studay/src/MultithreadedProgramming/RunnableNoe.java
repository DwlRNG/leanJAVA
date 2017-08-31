package MultithreadedProgramming;

/**
 * Created by Dw.L on 2017/7/26.  java 多线程一
 */
public class RunnableNoe implements Runnable{

    private Thread thread;

    private String Threadname;

    RunnableNoe(String getthreadname){

        Threadname = getthreadname;

        System.out.println("新建的线程名为   "+getthreadname);

    }


    @Override
    public void run() {
        System.out.println("进入运行的线程名为   "+Threadname);

        try {

            for (int i = 1; i<=20 ; i++) {

                System.out.println("线程  "+Threadname+"  开始运行第   "+i+" 次 ");

                Thread.sleep(50);  //线程进入阻塞休眠状态  50毫秒

                System.out.println("休眠结束。。。。。");
            }



        } catch (Exception e) {

            System.out.println("线程"+ Threadname +"出现问题");

        }

        System.out.println("线程结束运行");
    }


    public void start(){

        System.out.println("运行的线程为   "+Threadname);

        if (thread == null) {
            thread = new Thread (this, Threadname);
            thread.start ();
        }

    }





}
