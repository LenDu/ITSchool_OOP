package task_2;

/**
 * Created by Lena on 12/18/2017.
 */
public class CreateHuman {

    public static Human createHuman() {
        System.out.println("Input a human sex (M/W):");
        boolean sex = InputHumanData.inputSex();

        System.out.println("Input a human Name:");
        String name = InputHumanData.inputName();

        System.out.println("Input a human Surname:");
        String surname = InputHumanData.inputName();

        System.out.println("Input a human Height(cm):");
        float height = InputHumanData.inputHeight();

        System.out.println("Input a human Weight(kg):");
        float weight = InputHumanData.inputWeight();

        return sex ? new Man(sex, name, surname, height, weight)
                   : new Woman(sex, name, surname, height, weight);
    }
}
