package uk.ac.shef;

public class FixedClass {
    /*
     *  If x == null throw a NullPointerException, else return
     *  the index of the last element in x that equals y.
     *  If no such element exists, return -1.
     */
    public static int findLast(int[] x, int y) {
        for (int i = x.length - 1; i >= 0; i--) {
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }

}
