package lesson01;

public class Discriminant
{

    public static void main(String[]args){

        double a = 1;
        double b = 6;
        double c = 9;
        double d;
        double num1;
        double num2;

        d = Math.pow(b,2) - 4 * a * c;


        if (d > 0)
        {
             num1 = (- b + Math.sqrt(d)) / 2 * a;
             num2 = (- b - Math.sqrt(d)) / 2 * a;

            System.out.println("The roots of a quadratic equation:");
            System.out.println(num1);
            System.out.println(num2);
        }
        else if (d == 0)
        {
             num1 = - b  / 2 * a;

            System.out.println("The root of a quadratic equation:");
            System.out.println(num1);
        }
        else if (d < 0)
        {
            System.out.println("The discriminant is less than zero!");
        }

    }

}
