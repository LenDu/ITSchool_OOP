package task_2;

/**
 * Created by Lena on 12/17/2017.
 */
public class Human {
    protected boolean sex;
    protected String name;
    protected String surname;
    protected float height;
    protected float weight;

    public Human(boolean sex, String name, String surname, float height, float weight) {
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public Human() {

    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    boolean speak(Human human) {

        if (this.getSex() && human.getSex()) {
            return Math.random() < 0.5;
        } else {
            return true;
        }
    }

    boolean tolerateSociety(Human human) {

        if (this.getSex() || human.getSex()) {
            return Math.random() < 0.7;
        } else if (!this.getSex() && !human.getSex()) {
            return Math.random() < 0.05;
        } else {
            return Math.random() < 0.056;
        }

    }

    boolean spendTimeTogether(Human human) {
        float h1 = this.getHeight();
        float h2 = human.getHeight();
        if (h1 > h2) {
            return compareHeight(h1, h2);
        } else {
            return compareHeight(h2, h1);
        }
    }

    private static boolean compareHeight(float tallerHeight, float lowerHeight) {
        if ((100 - lowerHeight * 100 / tallerHeight) > 10) {
            return Math.random() <= 0.85;
        } else {
            return Math.random() <= 0.95;
        }
    }

    Human toBeInRelationships(Human human) {
        if (this.speak(human) && this.tolerateSociety(human) && this.spendTimeTogether(human)) {
            if (this.getSex() == human.getSex()) {
                return null;
            } else {
                return createChildHuman(this, human);
            }
        } else {
            return null;
        }
    }


    private static Human createChildHuman(Human firstHuman, Human secondHuman) {
        if (!firstHuman.getSex()) {
            Woman woman = (Woman) firstHuman;
            return woman.giveBirthToHuman(secondHuman);
        } else {
            Woman woman = (Woman) secondHuman;
            return woman.giveBirthToHuman(firstHuman);
        }
    }


    @Override
    public String toString() {
        return "{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
