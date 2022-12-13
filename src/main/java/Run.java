import kyu8.Kyu8;

public class Run {
    public static void main(String[] args) {
        Kyu8 kyu8 = new Kyu8();

        System.out.println("---Kata 4---");
        System.out.println(kyu8.check(new  Object[]{66, 101}, 66));
        System.out.println(kyu8.check(new  Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45));
        System.out.println(kyu8.check(new  Object[]{'t', 'e', 's', 't'}, 'e'));
        System.out.println(kyu8.check(new  String[]{"what", "a", "great", "kata"}, "kat"));

        System.out.println("---Kata 3---");
        System.out.println(kyu8.betterThanAverage(new int[]{2, 3}, 5));
        System.out.println(kyu8.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        System.out.println(kyu8.betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        System.out.println(kyu8.betterThanAverage(new int[] {100, 90}, 11));

        System.out.println("---Kata 2---");
        int []result = kyu8.digitize(35231);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]+" ");
        }

        System.out.println("---Kata 1---");
        System.out.println(kyu8.zeroFuel(50,25,2));
        System.out.println(kyu8.zeroFuel(100,50,1));
        System.out.println(kyu8.zeroFuel(50,25,4));
    }
}
