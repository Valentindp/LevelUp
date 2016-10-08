package lesson09.exmple;

/**
 * Created by SnowFlake on 03.10.2016.
 */
public class Employee  extends Human{
    protected String work;

    Employee(){
        work = "Work";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(work);
    }
}
