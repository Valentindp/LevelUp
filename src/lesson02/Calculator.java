package lesson02;

/**
 * Created by Валентин on 10.09.2016.
 */
public class Calculator {

    public static void main(String[] args) {

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[2]);

        char sign = args[1].charAt(0);

        switch (sign){
            case '+':{
                double result = num1 + num2;
                System.out.println("Result: "+result);
                break;
            }
            case '-':{
                double result = num1 - num2;
                System.out.println("Result: "+result);
                break;
            }
            case '/':{
                double result = num1 / num2;
                System.out.println("Result: "+result);
                break;
            }
            case '*':{
                double result = num1 + num2;
                System.out.println("Result: "+result);
                break;
            }
            case '%':{
                double result = num1 % num2;
                System.out.println("Result: "+result);
                break;
            }
            default:
                System.out.println("Error");
        }

    }
}
