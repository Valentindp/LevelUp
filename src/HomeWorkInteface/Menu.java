package HomeWorkInteface;

import java.util.ArrayList;

/**
 * Created by Валентин on 09.10.2016.
 */
public class Menu {

    ArrayList<Food> menu = new ArrayList<Food>();

    public void setToMenu(Food food) {
        menu.add(food);
    }

    public void getInfo() {
        for (int i = 0; i < this.getSize(); i++) {
            System.out.print(i + 1 + ".");
            menu.get(i).getInfo();
            System.out.println("\n");
        }
    }

    public int getSize() {
        return menu.size();
    }

}
