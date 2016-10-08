package lesson07;

import java.math.*;

/**
 * Created by Валентин on 02.10.2016.
 */
public class Main {

    public static void main(String[] args) {

        Student st = new Student();
        st.setYearOfStudy(1);
        st.increaseYearOfStudy(2);

//        System.out.println(st.getYearOfStudy());

        Box box = new Box();
        Box bigBox = new BigBox();

        Cat cat = new Cat();
        FatCat fatCat = new FatCat();

//        box.setCat(cat);
//        box.setCat(fatCat);

//        bigBox.setCat(cat);
//        bigBox.setCat(fatCat);

        Vector vecA = new Vector(4,5);
        Vector vecB = new Vector(10,10);

        double i = getVectorLength(vecA);

        System.out.println(i);



    }

    private static double getVectorLength(Vector vecA) {
        return Math.sqrt(Math.pow(vecA.getX(),2)+Math.pow(vecA.getY(),2));
}

}
