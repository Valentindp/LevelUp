package HomeWorkInteface;

import java.util.ArrayList;

/**
 * Created by Валентин on 09.10.2016.
 */
public class Menu {

    ArrayList<Food> list = new ArrayList<Food>();

    public void setToMenu(Food food){
        list.add(food);
    }
}
