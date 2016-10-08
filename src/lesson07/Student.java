package lesson07;

/**
 * Created by Валентин on 02.10.2016.
 */
public class Student extends Man {

    private int yearOfStudy;

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void increaseYearOfStudy(int increase){

        this.yearOfStudy += increase;
    }
}
