package task_2;

/**
 * Created by Lena on 12/17/2017.
 */
public class Man extends Human {

    public Man(boolean sex, String name, String surname, float height, float weight) {
        super(sex, name, surname, height, weight);
    }

    public Man() {

    }

    @Override
    public String toString() {
        return "Man " + super.toString();
    }
}
