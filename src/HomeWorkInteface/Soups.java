package HomeWorkInteface;

/**
 * Created by Валентин on 09.10.2016.
 */
public class Soups extends Food implements Edible {
    @Override
    public int getFlavour() {
        return 0;
    }

    @Override
    int getWeight() {
        return 0;
    }

    @Override
    void setWeight(int weight) {

    }

    public Soups(String name, double weight, double price, double calories) {
        super(name, weight, price, calories);
    }

    @Override
    public double getCalories() {
        return 0;
    }
}
