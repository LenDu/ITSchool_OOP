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

        System.out.println(human1.speak(human2));
        System.out.println(human2.speak(human1));

        System.out.println(human1.tolerateSociety(human2));
        System.out.println(human2.tolerateSociety(human1));

        System.out.println(human1.tolerateSociety(human2));
        System.out.println(human2.tolerateSociety(human1));
    }
}
