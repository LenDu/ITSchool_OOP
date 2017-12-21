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

    Human giveBirthToHuman(Human human) {
        if (Math.random() <= 0.5) {
            System.out.println("Please input girl name:");
            String girlName = InputHumanData.inputName();
            String girlSurname = human.getSurname();
            float girlHeight = (float) (this.height - 0.1 * (human.height - this.height));
            float girlWeight = (float) (this.weight - 0.1 * (human.weight - this.weight));
            Woman newGirl = new Woman(false, girlName, girlSurname, girlHeight, girlWeight);

            System.out.println("New human:");
            return newGirl;

        } else {
            System.out.println("Please input boy name:");
            String boyName = InputHumanData.inputName();
            String boySurname = human.getSurname();
            float boyHeight = (float) (human.height - 0.1 * (this.height - human.height));
            float boyWeight = (float) (human.weight - 0.1 * (this.weight - human.weight));
            Man newBoy = new Man(true, boyName, boySurname, boyHeight, boyWeight);

            System.out.print("New human: ");
            return newBoy;
        }

    }

    @Override
    public String toString() {
        return "Woman " + super.toString();
    }
}
