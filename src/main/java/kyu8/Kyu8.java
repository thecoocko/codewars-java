package kyu8;

import java.util.Arrays;

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
}