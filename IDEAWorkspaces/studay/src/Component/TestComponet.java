package Component;

import org.junit.Test;

/**
 * Created by Dw.L on 2017/8/24.
 */
public class TestComponet {

    @Test
    public void fun1(){

        Component component = new ConcreteComponent();

        ManDecoratorA manDecoratorA = new ManDecoratorA();

        manDecoratorA.setPerson(component);

        manDecoratorA.eat();

    }
}
