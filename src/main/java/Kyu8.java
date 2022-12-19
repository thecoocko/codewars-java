import java.util.*;
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

    public String areYouPlayingBanjo(String name) {
        return name.charAt(0)==Character.toUpperCase(name.charAt(0))? name + " plays banjo" :name + " does not play banjo";
    }

    public String areYouPlayingBanjo2(String name) {
        return name.charAt(0)=='R' || name.charAt(0)=='r'? name + " plays banjo" :name + " does not play banjo";
    }

    public String dnaToRna(String dna) {//t replace u
        return dna.toUpperCase().replace('T','U');
    }

    public int paperWork(int n, int m){
        return n*m>0 && (n>0 || m>0) ? n*m : 0;
    }

    public  boolean setAlarm(boolean employed, boolean vacation) {
        return employed == true && vacation==false? true : false;
    }

    public String greet(String name, String owner) {
        return name.equals(owner)  ? "Hello boss" : "Hello guest";
    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if(arrayOfSheeps[i]!=null && arrayOfSheeps[i] ==true){
                counter++;
            }
        }
        return counter;
    }

    public int min(int[] list) {
        int min = list[0];
        for (int i = 0; i < list.length; i++) {
            if(min>list[i]){
                min = list[i];
            }
        }
        return min;
    }

    public int max(int[] list) {
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if(max<list[i]){
                max = list[i];
            }
        }
        return max;
    }

    public  String bmi(double weight, double height) {// (bmi = weight / height2)
        float bmi = (float) (weight/(height*height));
        if(bmi <=18.5) return "Underweight";
        else if (bmi <= 25.0) return "Normal";
        else if (bmi <= 30.0) return "Overweight";
        return "Obese";
    }
    public String noSpace(final String x) {
        return x.replace(" ","");
    }

    public  int[] reverse(int n){
        int []array = new int[n];
        int [] reversed = new int[array.length];
        int j = array.length;
        for (int i = 0; i < n; i++) {
            array[i] = i+1;
        }

        for (int i = 0; i < n; i++) {
            reversed[j-1] = array[i];
            j = j -1;
        }

        return reversed;
    }


}
