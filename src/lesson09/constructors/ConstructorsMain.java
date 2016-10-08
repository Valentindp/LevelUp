package lesson09.constructors;

import lesson09.exmple.BigRoom;
import lesson09.exmple.Room;

/**
 * Created by SnowFlake on 03.10.2016.
 */
public class ConstructorsMain {

    public static void main(String[] args) {

        Room room = new BigRoom(5,5,null);
        System.out.println(room);

        if(room instanceof BigRoom) {
            System.out.println("dfdfdfdf");
        }

        System.out.println(room.getClass().getName());

    }

}
