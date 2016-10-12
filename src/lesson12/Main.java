package lesson12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by java on 12.10.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {

//        Box array[] = new Box[]{new Box(1,1), new Box(1,1), new Box(3,3)};
//
//        List<Box> list = new ArrayList<Box>();
//
//        for (Box box : array) {
//            if (list.contains(box)) {
//                System.out.println("Элемент уже есть!");
//                continue;
//            }
//                list.add(box);
//        }
//
//        System.out.println(list.toString());

//        FileWriter fileWriter = null;
//        try {
//            File file = new File("D:/file.txt");
//            if (!file.exists()) {
//                System.out.println("Not exists");
//                file.createNewFile();
//            }

//            fileWriter = new FileWriter(new File("D:/file2.txt"));
//            fileWriter.write("Red colored are checked exceptions. \nAny checked exceptions that may be thrown in a method must either be caught or declared in the method's throws clause. \nChecked exceptions must be caught at compile time. \nChecked exceptions are so called because both the Java compiler and the Java virtual machine check to make sure this rule is obeyed. \nGreen colored are uncheck exceptions. They are exceptions that are not expected to be recovered, such as null pointer, divide by 0, etc.");
//            fileWriter.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            fileWriter.close();
//        }

//        throw new IllegalArgumentException("Error");

        System.out.println(Thread.currentThread().getName());

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(2000);
//                }catch (InterruptedException e){
//                  e.printStackTrace();
//                }
//
//                System.out.println(Thread.currentThread().getName());
//            }
//        };
//
//        new Thread(runnable).start();

        Worker worker = new Worker();
        worker.setOnWorkDoneListener(new Worker.OnWorkDoneListener(){
            @Override
            public void onWorkDone() {
                System.out.println("Work done");
            }
        });

        new Thread(worker).start();


    }
}
