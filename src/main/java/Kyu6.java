import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
    public boolean check(String sentence) {
        ArrayList<Boolean> result = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; ++i) {
            result.add(sentence.toLowerCase().contains(String.valueOf(i)));
        }

        return result.stream().allMatch(i -> i == true ? true : false);
    }

    /**
     * Given a variable n,
     * <p>
     * If n is an integer, Return a string with dash'-'marks before and after each odd integer, but do not begin or end the string with a dash mark. If n is negative, then the negative sign should be removed.
     * <p>
     * If n is not an integer, return an empty value.
     * <p>
     * Ex:
     * <p>
     * dashatize(274) -> '2-7-4'
     * dashatize(6815) -> '68-1-5'
     */

    public static String dashatize(int num) {
        String doubleDash = ("-(?:-)");
        String cleanStart = ("(^-)");
        String cleanEnd = ("(-$)");
        String result = "";

        char[] charArray = String.valueOf(num).replaceAll(cleanStart, "").toCharArray();

        for (Character ch : charArray) {
            if (Integer.parseInt(String.valueOf(ch)) % 2 != 0) result += "-" + ch + "-";
            else result += ch;
        }
        return result.replaceAll(doubleDash, "-")
                .replaceAll(cleanStart, "")
                .replaceAll(cleanEnd, "");
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

    /**
     * 1/2 (sqrt(1 - 8 sqrt(m)) - 1)
     */
    public static long findNb(long m) {
        return (int) (Math.sqrt(2 * (Math.sqrt(1.0 * m))));

    }

    public static String high(String s) {
        Map<String, Integer> scores = Map.ofEntries(Map.entry("a", 1), Map.entry("b", 2), Map.entry("c", 3));

        return "";
    }

    public static String camelCase(String input) {
        return null;
    }

    //{ 1, 1, 1, 2, 1, 1 }
    public static double findUniq(double arr[]) {
//        return Arrays.stream(arr).distinct().filter((a->Arrays.stream(arr).filter(b->a==b).count()==1)).toArray()[0];
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }

    /**Implement a pseudo-encryption algorithm which given a string S and an integer N concatenates all the odd-indexed characters of S with all the even-indexed characters of S, this process should be repeated N times.

     Examples:

     encrypt("012345", 1)  =>  "135024"
     encrypt("012345", 2)  =>  "135024"  ->  "304152"
     encrypt("012345", 3)  =>  "135024"  ->  "304152"  ->  "012345"

     encrypt("01234", 1)  =>  "13024"
     encrypt("01234", 2)  =>  "13024"  ->  "32104"
     encrypt("01234", 3)  =>  "13024"  ->  "32104"  ->  "20314"*/

    public static String encrypt(final String text, final int n) {
        if(text == null) return text;
        ArrayList<String> odd = new ArrayList<>();
        ArrayList<String> even = new ArrayList<>();

        for(int i =0 ; i<text.length();i++){
                if(i%2==0) even.add(text.split("")[i]);
                else  odd.add(text.split("")[i]);
        }

        return n<=0?text:encrypt(String.join("",even).concat(String.join("",odd)),n-1);
    }

    public static String decrypt(final String encryptedText, final int n) {
        if(encryptedText == null || "".equals(encryptedText) || n <= 0)
            return encryptedText;
        else{
            int len = encryptedText.length();
            int mid = (int) Math.floor(len/2);
            String result = "";
            for(int i=0,j=mid; i<mid; i++,j++){
                result += encryptedText.charAt(j)+"";
                result += encryptedText.charAt(i)+"";
            }
            if(len % 2 != 0) result += encryptedText.charAt(len -1)+"";

            return (n > 1) ? decrypt(result, n-1) : result;
        }

    }
    /**Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

     For example (Input --> Output):

     39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
     999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
     4 --> 0 (because 4 is already a one-digit number)*/
    public static int persistence(long n) {
        if(n<10) return 0;
        else {
            int multiplication = 1;
            while(n>0){
                multiplication*=(n%10);
                n/=10;
            }
            return 1 + persistence(multiplication);
        }
    }
}


