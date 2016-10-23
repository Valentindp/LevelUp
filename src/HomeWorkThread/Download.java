package HomeWorkThread;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Observable;

/**
 * Created by Валентин on 23.10.2016.
 */
public class Download extends Observable implements Runnable {

    private URL url;
    private String pathDownloadString;

    public static final int DOWNLOADING = 0;
    public static final int COMPLETE = 1;
    private String FileName;

    private int status;

    public Download(URL url, String pathDownloadString) {
        this.url = url;
        this.pathDownloadString = pathDownloadString;
        FileName = getFileName(url);

        download();
    }

    private void download() {
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        BufferedInputStream bis = null;
        FileOutputStream fis = null;

        stateChanged();

        try {
            bis = new BufferedInputStream(url.openStream());
            fis = new FileOutputStream(pathDownloadString + FileName);
            byte[] buffer = new byte[1024];
            int count = 0;
            while ((count = bis.read(buffer, 0, 1024)) != -1) {
                fis.write(buffer, 0, count);
            }
            fis.close();
            bis.close();

            if(status == DOWNLOADING) {
                status = COMPLETE;
                stateChanged();
            }
        } catch (Exception e) {
            //error();
        } finally {
            if (fis != null)
                try {
                    fis.close();
                } catch (Exception e) {
                    // ...
                }

            if (bis != null)
                try {
                    bis.close();
                } catch (Exception e) {
                    // ...
                }
        }

    }

    private String getFileName(URL url) {
        String fileName = url.getFile();
        return fileName.substring(fileName.lastIndexOf('/') + 1);
    }

    private void stateChanged() {

        if (status == DOWNLOADING){
            System.out.println("Begin downloading file " + FileName);
        }else {
            System.out.println("Downloading file " + FileName + " complite!");
        }

    }
}
