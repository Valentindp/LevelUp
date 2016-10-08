package lesson02;

/**
 * Created by Валентин on 10.09.2016.
 */
public class Temperature {
    public static void main(String[] args) {

        int t = Integer.parseInt(args[0]);
        char s = args[1].charAt(0);

        if (s == 'F') {
            toCelsius(t);
        } else if (s == 'C') {
            toFahrenheit(t);
        } else {
            System.out.println("Select the unit of measurement.");
        }


    }

    private static void toFahrenheit(int t) {

        int far = (t * 9) / 5 + 32;

        System.out.println("Temperature " + far + "F");
    }

    private static void toCelsius(int t) {

        int cel = (t -32) * 5 / 9;

        System.out.println("Temperature " + cel + "C");
    }
}
