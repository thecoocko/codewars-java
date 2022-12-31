import java.util.*;
import java.util.stream.Collectors;


public class Kyu7 {
    public static List<String> number(List<String> lines) {

        List<String> newList = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            newList.add((i+1)+": "+lines.get(i));
        }
        return newList;
    }

    public static String highAndLow(String numbers) {
        return Arrays.stream(Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray()).max().getAsInt()+ " " + Arrays.stream((Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray())).min().getAsInt();
    }

    public static String longest (String s1, String s2) {
        String[] s = (s1 + s2).split("");

        return Arrays.stream(s).sorted().distinct().collect(Collectors.joining());
    }

    public static int arithmetic(int a, int b, String operator) {
        switch (operator){
            case "add": return a+b;
            case "subtract": return a-b;
            case "multiply": return a*b;
            case "divide": return a/b;
        }
        return 0;
    }

    public static int adjacentElementsProduct(int[] array) {
        int max =  array[0]*array[1];
            for (int i = 0; i < array.length-1; i++)
                max = Math.max(max,array[i]*array[i+1]);
        return max;
    }

    public static int sortDesc(final int num) {
        int number = num;
        int  reverse = 0;
        while(number!=0) {
            int remained  = number%10;
            reverse = reverse * 10 + remained;
            number /= 10;
        }
        return reverse;
    }

    public static int GetSum(int a, int b)
    {
        int sum = 0;
        int start = a>b ? b :a;
        int end = a>b ? a:b;
        for (int i = start; i < end+1; i++) {
            sum+=i;
        }
        return sum;
    }

    //hourly speed (3600 * delta_distance) / s
    public static int gps(int s, double[] x) {
        // your code
        return 1;
    }

    public static boolean getXO (String str) {
        return str.toLowerCase().replace("o","").length() ==  str.toLowerCase().replace("x", "").length();

    }


}
