package HomeWorkInteface;

/**
 * Created by Валентин on 08.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        Food coffee = new Beverages("Coffee", 50, 20, 10);
        Food tea = new Beverages("Tea", 50, 10, 1);
        Food cake = new Dessert("Cake", 100, 250, 300);
        Food soup = new Soups("Soup", 150, 100, 200);

        Menu menu = new Menu();

        menu.setToMenu(coffee);
        menu.setToMenu(tea);
        menu.setToMenu(cake);
        menu.setToMenu(soup);


//        System.out.println(menu.getSize());
        menu.getInfo();


    }
}
