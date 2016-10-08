package lesson09.extention;

/**
 * Created by SnowFlake on 03.10.2016.
 */
public class Subject {

    protected int mass = 0;

    protected int width = 0;

    protected int height = 0;

    protected int length = 0;

    public Subject() {
        System.out.println("default");
        mass = 10;
    }

    public Subject(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
