package lesson12;

/**
 * Created by java on 12.10.2016.
 */
public class Box {
    private int width;
    private int heigth;

    public Box(int width, int heigth) {

        this.width = width;
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Width: " + width + ",heigth: " + heigth;
    }

    @Override
    public boolean equals(Object obj) {
        Box b = (Box) obj;
        return this.width == b.width && this.heigth == b.heigth;
    }
}
