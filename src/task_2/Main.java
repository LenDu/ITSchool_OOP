package task_2;

/**
 * Created by Lena on 12/17/2017.
 */
public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1 = CreateHuman.createHuman();
        System.out.println(human1);

        Human human2 = new Human();
        human2 = CreateHuman.createHuman();
        System.out.println(human2);

        System.out.println(Test.test(human1, human2));

    }
}
