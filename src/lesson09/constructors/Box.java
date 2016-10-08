package lesson09.constructors;

import lesson09.extention.Subject;

/**
 * Created by SnowFlake on 03.10.2016.
 */
public class Box extends Subject {

    public Box(int side) {
        this(side, side);
    }

    public Box(int width, int height) {
        super(34);
        this.width = width;
        this.height = height;
        this.length = width;
    }

    public Box(int width, int height, int length) {
        this(width, height);
        this.length = length;
    }

    public int getValueOfBox() {
        return width * length * height;
    }

}
