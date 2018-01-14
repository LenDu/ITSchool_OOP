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

    Human giveBirthToHuman(Human man) {
        if (Math.random() <= 0.5) {
            return this.createChildBoy(man);
        } else {
            return this.createChildBoy(man);
        }
    }

    private Human createChildGirl(Human man) {
        System.out.println("Please input girl name:");
        String girlName = InputHumanData.inputName();
        String girlSurname = man.getSurname();
        float girlHeight = (float) (this.height - 0.1 * (man.height - this.height));
        float girlWeight = (float) (this.weight - 0.1 * (man.weight - this.weight));
        Woman newGirl = new Woman(false, girlName, girlSurname, girlHeight, girlWeight);
        System.out.println("New human:");
        return newGirl;
    }

    private Human createChildBoy(Human man) {
        System.out.println("Please input boy name:");
        String boyName = InputHumanData.inputName();
        String boySurname = man.getSurname();
        float boyHeight = (float) (man.height - 0.1 * (this.height - man.height));
        float boyWeight = (float) (man.weight - 0.1 * (this.weight - man.weight));
        Man newBoy = new Man(true, boyName, boySurname, boyHeight, boyWeight);
        System.out.print("New human: ");
        return newBoy;
    }

    @Override
    public String toString() {
        return "Woman " + super.toString();
    }
}
