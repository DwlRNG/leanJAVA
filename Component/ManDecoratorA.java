package Component;

/**
 * Created by Dw.L on 2017/8/24.
 */
public class ManDecoratorA extends Decorator {

    @Override
    public void eat() {
        super.eat();
        reeat();
    }

    public void reeat(){

        System.out.println("吃的蛋糕");

    }

}
