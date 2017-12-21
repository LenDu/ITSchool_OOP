package task_2;

import task_2.Human;

import java.util.Scanner;

/**
 * Created by Lena on 12/17/2017.
 */
public class InputHumanData {

    //method for input Human Sex from the keyboard
    static boolean inputSex() {
        boolean sex = true, repeat = false;
        Scanner scanner = new Scanner(System.in);

        do {
            String input = scanner.nextLine();

            if (input.equals("W")) {
                sex = false;
                break;
            } else if (input.equals("M")) {
                break;
            } else {
                repeat = true;
                System.out.println("Wrong input. Please repeat:");
            }

        } while (repeat == true);

        return sex;
    }

    //method fot input Human Name and Surname from the keyboard
    static String inputName() {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    //method for input Human Height and Weight from the keyboard
    static float inputParameters() {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return Float.parseFloat(input);
    }

}
