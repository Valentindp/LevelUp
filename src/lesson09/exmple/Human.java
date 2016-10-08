package lesson09.exmple;

/**
 * Created by SnowFlake on 03.10.2016.
 */
public class Human {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.println(String.format
                ("Name: %s, age: %d", name, age));
    }
}
