package HomeWorkInteface;

/**
 * Created by Валентин on 09.10.2016.
 */
public class BasedDishes extends Food implements Edible {
    @Override
    int getWeight() {
        return 0;
    }

    @Override
    void setWeight(int weight) {

    }

    public BasedDishes(String name, double weight, double price, double calories) {
        super(name, weight, price, calories);
    }

    @Override
    public Flavour getFlavour() {
        return Flavour.BITTER;
    }

    @Override
    public double getCalories() {
        return 0;
    }
}
