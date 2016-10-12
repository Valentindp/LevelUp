package lesson12;

/**
 * Created by java on 12.10.2016.
 */
public class Worker implements Runnable {

    interface OnWorkDoneListener {
        void onWorkDone();
    }

    private OnWorkDoneListener onWorkDoneListener = null;

    public OnWorkDoneListener getOnWorkDoneListener() {
        return onWorkDoneListener;
    }

    public void setOnWorkDoneListener(OnWorkDoneListener onWorkDoneListener) {
        this.onWorkDoneListener = onWorkDoneListener;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker");

        if (onWorkDoneListener != null) {
            onWorkDoneListener.onWorkDone();
        }

    }
}
