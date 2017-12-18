package task_2;

/**
 * Created by Lena on 12/17/2017.
 */
public class Woman extends Human {

    public Woman(boolean sex, String name, String surname, float height, float weight) {
        super(sex, name, surname, height, weight);
    }

    public Woman() {

    }

    Human giveBirthToPerson() {
        Human human = new Human(false, "Woman1", "Woman11", 0.45f, 3.5f);
        return human;
    }

    @Override
    public String toString() {
        return "Woman " + super.toString();
    }
}
