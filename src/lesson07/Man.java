package lesson07;

import lesson03.StringOperations;

/**
 * Created by Валентин on 02.10.2016.
 */
public class Man {

    public Man() {
    }

    public Man(String name, int age, int weight, boolean male) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.male = male;
    }

    private String name;
    private int age;
    private int weight;
    private boolean male;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
