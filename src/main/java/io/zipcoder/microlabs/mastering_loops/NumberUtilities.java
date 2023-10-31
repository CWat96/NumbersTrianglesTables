package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    static boolean isOdd(int number) {
        return (number % 2) != 0;
    }
    public static String getEvenNumbers(int start, int stop) {

        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i = i + 1) {
            if (!isOdd(i)) {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i = i + 1) {
            if (isOdd(i)) {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }

    public static String getRange(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i = i + step) {
            sb.append(i);
        }
        return sb.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i = i + step) {
            //sb.append((int) Math.pow(i,exponent));
            sb.append(Math.round(Math.pow(i,exponent)));
        }
        return sb.toString();
    }
}