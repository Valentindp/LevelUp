package HomeWorkThread;

import java.util.ArrayList;

/**
 * Created by Валентин on 23.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<String> links = new ArrayList<String>();
        links.add("https://habrastorage.org/storage1/8ce732f8/e6d46bea/e258a346/4f7e5f56.png");
        links.add("https://habrastorage.org/storage2/5d4/4de/a74/5d44dea74acc5fdf08e75d4eb6590199.png");
        links.add("https://habrastorage.org/files/1fa/dcd/d8e/1fadcdd8ed2942f795c2d9f65aceb2ad.png");
        links.add("https://habrastorage.org/storage2/3a5/318/fe9/3a5318fe9be5bf9e423ccfe8586407cd.jpg");
        links.add("http://crypto.pp.ua/wp-content/uploads/2010/06/clip_image0043.gif");
        links.add("https://docs.oracle.com/javase/tutorial/figures/essential/exceptions-throwable.gif");

        String pathDownloadString = "D:/JavaImage/";

        new ImageLoader().LoadImages(links,pathDownloadString);


    }
}
