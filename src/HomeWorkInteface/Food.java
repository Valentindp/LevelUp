package HomeWorkInteface;

import lesson03.StringOperations;

/**
 * Created by Валентин on 08.10.2016.
 */
abstract class Food implements Edible {
    double weight;
    boolean salty;
    boolean bitter;
    boolean sweet;
    double calories;
    double price;
    String name;

    public Food() {
    }


    public Food(String name, double weight, double price, double calories) {
        this.weight = weight;
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    abstract int getWeight();

    abstract void setWeight(int weight);

    public void getInfo() {
        System.out.println("Name - " + name + "\nWeight - " + weight + "\nCalories - " + calories + "\nPrice - " + price);
    }

    ;
}
