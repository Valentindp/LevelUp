package HomeWorkInteface;

/**
 * Created by Валентин on 09.10.2016.
 */
public class Dessert extends Food implements Edible {

    @Override
    public Flavour getFlavour() {
        return Flavour.SWEET;
    }

    public Dessert(String name, double weight, double price, double calories) {
        super(name, weight, price, calories);
    }

    @Override
    public double getCalories() {
        return 0;
    }

    @Override
    int getWeight() {
        return 0;
    }

    @Override
    void setWeight(int weight) {

    }
}
