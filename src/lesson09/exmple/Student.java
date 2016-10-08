package lesson09.exmple;

/**
 * Created by SnowFlake on 03.10.2016.
 */
public class Student extends Object
{
    protected   final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
