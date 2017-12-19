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

        System.out.println("Speak h1: " + human1.speak(human2));
        System.out.println("Speak h2: " + human2.speak(human1));

        System.out.println("Tolerate h1: " + human1.tolerateSociety(human2));
        System.out.println("Tolerate h2: " + human2.tolerateSociety(human1));

        System.out.println("Spend time h1: " + human1.spendTimeTogether(human2));
        System.out.println("Spend time h2: " + human2.spendTimeTogether(human1));

        if(!human1.getSex()){
            Woman woman1 = (Woman) human1;
            System.out.println("Give a birth: " + woman1.giveBirthToHuman(human2));
        }
        if(!human2.getSex()){
            Woman woman2 = (Woman) human2;
            System.out.println("Give a birth: " + woman2.giveBirthToHuman(human1));
        }
    }
}
