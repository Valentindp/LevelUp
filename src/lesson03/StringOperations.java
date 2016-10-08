package lesson03;

import java.util.Scanner;

/**
 * Created by Валентин on 13.09.2016.
 */
public class StringOperations {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String strRep = "нам";
//        System.out.println("Введите строку.");
//        String str = readNextLine();
        String str = "нам нужно удалить";


        if(str.contains(strRep)){
            String strAfter = str.replace(strRep,"");
            System.out.println(strAfter);
        }


        String strRep2 = "хрю";
        String str2 = "хрюшка хрюкает ";

        if(str2.startsWith(strRep2)){
            System.out.println(str2.substring(0,strRep2.length()));
        }

        if(str2.length()>10){
            String newstr2 = str2.concat(str2);
            System.out.println(newstr2);
        }

        String strRep3 = "па";
        String str3 = "трмапамапа";

        if (str3.endsWith(strRep3)){
            StringBuilder strb = new StringBuilder(str3);

                strb.delete(4,6);
                System.out.println(strb);

        }


    }

    private static String readNextLine() {
        return scanner.nextLine();
    }
}
