package lesson07;

/**
 * Created by Валентин on 02.10.2016.
 */
public class Box {


    public int width;
    public int height;
    protected Cat cat;

    private static boolean size = false;


    public Box() {
        width = 7;
        height = 8;
    }

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public void setBoxOpen() {
        System.out.println("Box is open");
    }

    private int calculateVolumeBox() {
        int result = width * width * height;
        return result;
    }

    public void showInfo() {
        System.out.println("volume is = " + calculateVolumeBox());
    }

    public boolean isSize() {
        return size;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
        cat.meow();
    }

    public void setCat(FatCat cat) {
        if (cat.isFat()) {
            System.out.println("This cat is too fat for that box!");
        }
    }
}