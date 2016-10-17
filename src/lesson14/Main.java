package lesson14;

/**
 * Created by java on 17.10.2016.
 */
public class Main {
    public static void main(String[] args) {

    final  WorkSender workSender = new WorkSender();
        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
             workSender.sendWork();
            }
        };

        thread.start();

        System.out.println(thread.getState());

        try{
            thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(thread.getState());

        workSender.prepareInfo();
        


    }
}
