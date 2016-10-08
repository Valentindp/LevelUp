package lesson09.exmple;

import java.util.Arrays;

/**
 * Created by SnowFlake on 03.10.2016.
 */
public class App00 {
//    Student student = new Student("Alpha");

//    public static void main(String[] args) {
//        Human human = new Human();
//        human.setName("Alex");
//        human.setAge(20);
//        Human employee = new Employee();
//        employee.setName("Mark");
//        employee.setAge(56);
//        Human nurse = new Nurse();
//
//        human.printInfo();
//        employee.printInfo();
//        nurse.printInfo();
//
//
//    }
////        Student student = null;
//        Student[] students = new Student[5];
//        for (int i = 0; i < students.length; i++){
//            students[i] = new Student("Alpha" + i);
//          //  System.out.println(student.name);
//        }
//
////        for (int i = 0; i < 5; i++){
////            System.out.println(students[i].name);
////        }
//     System.out.println(Arrays.toString(students));
//    }
//*/


    public static void main(String[] args) {
        Object object1 = new Object() {
            @Override
            public String toString() {
                return "object1";
            }
        };
        Object object2 = new Object() {
            @Override
            public String toString() {
                return "object2";
            }
        };

        System.out.println(object1);
        System.out.println(object2);
    }

}

