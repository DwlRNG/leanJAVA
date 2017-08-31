package zsms;


/**
 * Created by Dw.L on 2017/5/20.
 */
public class pushphone implements phone {




    public pushphone(phone phone) {

    }

    @Override
    public void CUP() {

            pushCPU();
    }

    @Override
    public void Amland() {

            pushAmland();

    }



    public  void pushCPU(){

        System.out.println("装饰过后我用的A处理器");
    }


    public void pushAmland(){

        System.out.println("装饰过后我用的LG的屏幕");
    }

}
