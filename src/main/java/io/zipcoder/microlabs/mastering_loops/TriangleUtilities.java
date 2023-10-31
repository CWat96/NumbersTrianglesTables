package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result = "";
        for (int i=1; i< numberOfRows; i++) {
            result += getRow(i);
            result += "\n";
        }
        return result;
    }

    public static String getRow(int numberOfStars) {
        String result = "";
        for (int i=0; i<numberOfStars; i++) {
            result += "*";
        }
        return result;
    } // do first

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
