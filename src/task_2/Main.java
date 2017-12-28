package task_2;

/**
 * Created by Lena on 12/17/2017.
 */
public class Main {
    public static void main(String[] args) {
        Human firstHuman = CreateHuman.createHuman();
        System.out.println(firstHuman);

        Human secondHuman = CreateHuman.createHuman();
        System.out.println(secondHuman);

        Human compatibilityResult = CompatibilityTest.compatibilityTest(firstHuman, secondHuman);

        if (compatibilityResult == null){
            System.out.println("Ничего не вышло... разбежались");
        }else{
            System.out.println(compatibilityResult);
        }


    }
}
