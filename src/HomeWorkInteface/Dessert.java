package HomeWorkInteface;

/**
 * Created by Валентин on 09.10.2016.
 */
public class Dessert extends Food implements Edible {

    @Override
    public int getFlavour() {
        return 0;
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
