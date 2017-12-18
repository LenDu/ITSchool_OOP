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
        return false;
    }

    Human toBeInRelationships(Human human) {
        return human;
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
