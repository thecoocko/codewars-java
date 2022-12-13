package kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kyu8 {
    public  boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return mpg*fuelLeft==distanceToPump||  mpg*fuelLeft>distanceToPump;
    }
    public  int[] digitize(long n) {
        String []str = Long.toString(n).split("");
        int []number = new int[str.length];
        int j = str.length-1;
        for(String i:str){
            number[j] = Integer.parseInt(i);
            j--;
        }
        return number;
    }
    public  boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int []points = new int[classPoints.length];
        System.arraycopy(classPoints,0,points,0,classPoints.length);
        double avg = Arrays.stream(points).average().getAsDouble();
        return avg<yourPoints;
    }
    public  boolean check(Object[] a, Object x) {
        boolean flag = false;
        for (Object i:a) {
            if(i==x){
                flag = true;
            }
        }
        return flag;
    }
    public String updateLight(String current) {

        switch(current){
            case "green":
                return "yellow";
            case "red":
                return "green";
            case "yellow":
                return "red";
        }
        return current;
    }
    public String countingSheep(int num) {
        String sheeps[] = new String[num+1];
        for (int i = 1; i < num+1; i++) sheeps[i] = i+" sheep...";
        return Arrays.stream(sheeps).filter(i->i!=null).collect(Collectors.joining());
    }

}
