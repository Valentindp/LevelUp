package lesson07;

/**
 * Created by Валентин on 02.10.2016.
 */
public class Cat {

    private static boolean fat = false;

    public int age = 6;

    private static int countOfCats = 0;

    public Cat() {
        incrCountOfCats();
    }

    public static boolean isFat() {
        return fat;
    }

    public static int getCountOfCats() {
        return countOfCats;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow() {
        System.out.println("Meowww");
    }

    private void incrCountOfCats(){
        countOfCats++;
    }


}