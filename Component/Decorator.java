package Component;

/**
 * Created by Dw.L on 2017/8/24.
 */
public class Decorator implements Component {

    protected Component person;

    public void setPerson(Component person) {
        this.person = person;
    }

    public void eat() {
        person.eat();
    }



}
