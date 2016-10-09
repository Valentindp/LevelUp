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

    @Override
    public int getFlavour() {
        return 0;
    }

    @Override
    public double getCalories() {
        return 0;
    }
}
