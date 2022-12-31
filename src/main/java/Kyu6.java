import java.util.ArrayList;

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
    /* num = str(n)
    total = sum([int(num[i]) ** (p + i) for i in range(len(num))])
    return total / n if (total % n) == 0 else -1*/

//    public static long digPow(int n, int p) {
//        // your code
//        return -1;
//    }
public boolean check(String sentence){
    ArrayList<Boolean> result = new ArrayList<Boolean>();
    for (char i = 'a'; i <= 'z'; ++i) {
        result.add(sentence.toLowerCase().contains(String.valueOf(i)));
    }

    return result.stream().allMatch(i->i==true? true: false);
}

}
