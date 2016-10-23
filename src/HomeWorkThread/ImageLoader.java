package HomeWorkThread;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Валентин on 23.10.2016.
 */
public class ImageLoader {

    public void LoadImages(ArrayList<String> arrayLinks, String pathDownloadString) {
        for (String link : arrayLinks) {
            URL url = null;
            try {
                url = new URL(link);
                new Download(url, pathDownloadString);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

    }


}
