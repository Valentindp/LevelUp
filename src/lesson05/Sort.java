package lesson05;

import java.util.Arrays;

/**
 * Created by Валентин on 25.09.2016.
 */
public class Sort {

    public static void main(String[] args) {


        int array1[] = {10, 30, 50, 70, 90, 110, 120, 130, 140, 150};
        int array2[] = {20, 40, 60, 70, 80, 85};


        if (array1.length < array2.length) {
            int result[] = foldSortArray(array1, array2);
            System.out.println(Arrays.toString(result));
        } else {
            int result[] = foldSortArray(array2, array1);
            System.out.println(Arrays.toString(result));
        }


    }

    private static int[] foldSortArray(int[] shortArray, int[] longArray) {
        int result[] = new int[shortArray.length + longArray.length];

        int indexLong = 0;

        for (int indexShort = 0; indexShort <= shortArray.length - 1; indexShort++) {


            while (shortArray[indexShort] > longArray[indexLong]) {
                result[indexShort + indexLong] = longArray[indexLong];
                indexLong++;
                if (indexLong == longArray.length) {
                    break;
                }

            }

            result[indexShort + indexLong] = shortArray[indexShort];

        }

        if (indexLong < longArray.length) {
            System.arraycopy(longArray, indexLong, result, indexLong + shortArray.length, longArray.length - indexLong);
        }

        return result;
    }


}
