package lesson09.exmple;

/**
 * Created by SnowFlake on 03.10.2016.
 */
public class BigRoom extends Room {

    private Nurse nurse = null;

    public BigRoom(int numberOfWindows, int numberOfDoors, Nurse nurse) {
        super(numberOfWindows);
        this.nurse = nurse;
        super.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return String.format("Количество окон: %d, количество дверей %d", numberOfWindows, numberOfDoors);
    }


}
