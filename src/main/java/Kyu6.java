import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kyu6 {
    public static int findIt(int[] a) {
        /**Given an array of integers, find the one that appears an odd number of times.

         There will always be only one integer that appears an odd number of times.

         Examples
         [7] should return 7, because it occurs 1 time (which is odd).
         [0] should return 0, because it occurs 1 time (which is odd).
         [1,1,2] should return 2, because it occurs 1 time (which is odd).
         [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd)*/

        int result = 0;
        for (int j = 0; j < a.length; j++) {
            result = result ^ a[j];
        }
        return result;
    }
}
