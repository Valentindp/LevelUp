package lesson14;

/**
 * Created by java on 17.10.2016.
 */
public class WorkSender {

    private final Object monitor = new Object();

    public void sendWork() {
        System.out.println("send work...");
        synchronized (monitor) {
            try {
                monitor.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("work done.");
        }
    }

    public void prepareInfo() {
        synchronized (monitor) {
            monitor.notify();
        }
    }
}

