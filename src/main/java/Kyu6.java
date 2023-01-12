import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        ArrayList<Boolean> result = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; ++i) {
            result.add(sentence.toLowerCase().contains(String.valueOf(i)));
        }

        return result.stream().allMatch(i->i==true? true: false);
    }
    /**Given a variable n,

     If n is an integer, Return a string with dash'-'marks before and after each odd integer, but do not begin or end the string with a dash mark. If n is negative, then the negative sign should be removed.

     If n is not an integer, return an empty value.

     Ex:

     dashatize(274) -> '2-7-4'
     dashatize(6815) -> '68-1-5'*/

    public static String dashatize(int num) {
        String doubleDash = ("-(?:-)");
        String cleanStart = ("(^-)");
        String cleanEnd = ("(-$)");
        String result = "";

        char [] charArray = String.valueOf(num).replaceAll(cleanStart,"").toCharArray();

        for(Character ch : charArray){
            if(Integer.parseInt(String.valueOf(ch))%2!=0) result+="-"+ch+"-";
            else result+=ch;
        }
        return  result.replaceAll(doubleDash,"-")
                .replaceAll(cleanStart,"")
                .replaceAll(cleanEnd,"");
    }

//    public static String longestConsec(String[] strarr, int k) {
//        // your code
//    }

//"[:;][-~]?[)D]"
public static int countSmileys(List<String> arr) {
    int count = 0;
    Pattern pattern = Pattern.compile("[:;][-~]?[)D]");
    for (String i : arr) {
        Matcher matcher = pattern.matcher(i);
        if (matcher.matches()) count++;
    }
    return count;
}

/**1/2 (sqrt(1 - 8 sqrt(m)) - 1)*/
    public static long findNb(long m) {
        return (int)(Math.sqrt(2 * (Math.sqrt(1.0 * m))));

    }
    public static String high(String s) {
        Map<String,Integer> scores = Map.ofEntries(Map.entry("a",1),Map.entry("b",2),Map.entry("c",3));

        return "";
    }

    public static String camelCase(String input) {
        return null;
    }
}
