import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kyu5 {
    public static boolean alphanumeric(String s){
        if(s.length()==0) return  false;
        String pattern = "[a-zA-z0-9]+";
        System.out.println("S: "+s+"\t");
        s = s.replaceAll(pattern,"");
        System.out.println("S: "+s+"\t");
        return s.length() == 0?true:false;
    }

    public static long ipsBetween(String start, String end) {
        long []s = Arrays.stream(start.split("\\.")).mapToLong(Long::parseLong).toArray();
        long [] e = Arrays.stream(end.split("\\.")).mapToLong(Long::parseLong).toArray();
        long d1 = ((((((s[0] << 8) + s[1]) << 8) + s[2]) << 8) + s[3]);
        long d2 = ((((((e[0] << 8) + e[1]) << 8) + e[2]) << 8) + e[3]);
        return d2-d1;
    }



}
