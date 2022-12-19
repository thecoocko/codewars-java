import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        //Test task for company
        int []nums = {1,5,8,3,2};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i%2!=0){
                sum+=nums[i]*nums[i+1];
            }
        }
        sum = sum+nums[0];
        System.out.println(sum);
        //end of test task

        Kyu8 kyu8 = new Kyu8();

        System.out.println("---Kata 15---");
        System.out.println(kyu8.reverse(5));

        System.out.println("---Kata 14---");
        System.out.println(kyu8.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        System.out.println(kyu8.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"   ));
        System.out.println(kyu8.noSpace("8aaaaa dddd r     "));
        System.out.println(kyu8.noSpace("jfBm  gk lf8hg  88lbe8 "));
        System.out.println(kyu8.noSpace("8j aam"));


        System.out.println("---Kata 13---");
        System.out.println(kyu8.bmi(80, 1.80));

        System.out.println("---Kata 12---");
        System.out.println(kyu8.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        System.out.println(kyu8.min(new int[]{42, 54, 65, 87, 0}));
        System.out.println(kyu8.max(new int[]{4,6,2,1,9,63,-134,566}));
        System.out.println(kyu8.max(new int[]{5}));

        System.out.println("---Kata 11---");
        System.out.println(kyu8.countSheeps(new Boolean[]{true,  true,  true,  false, true,  true,  true,  true , true,  false, true,  false, true,  false, false, true , true,  true,  true,  true , false, false, true,  true }));
        System.out.println(kyu8.countSheeps(new Boolean[]{null,  true,  null,  false, null,  true,  true,  true , true,  false, true,  false, true,  false, false, true , true,  true,  true,  true , false, false, true,  true }));

        System.out.println("---Kata 10---");
        System.out.println(kyu8.greet("Daniel", "Daniel"));
        System.out.println(kyu8.greet("Greg", "Daniel"));
        System.out.println(kyu8.greet("Maria", "Maria"));


        System.out.println("---Kata 9---");
        System.out.println(kyu8.setAlarm(true, false));
        System.out.println(kyu8.setAlarm(true, true));
        System.out.println(kyu8.setAlarm(false, false));
        System.out.println(kyu8.setAlarm(false, true));

        System.out.println("---Kata 8---");
        System.out.println(kyu8.paperWork(5,5));
        System.out.println(kyu8.paperWork(5,-5));
        System.out.println(kyu8.paperWork(-5,-5));
        System.out.println(kyu8.paperWork(-5,5));
        System.out.println(kyu8.paperWork(5,0));


        System.out.println("---Kata 7---");
        System.out.println(kyu8.dnaToRna("TTTT"));
        System.out.println(kyu8.dnaToRna("GCAT"));

        System.out.println("---Kata 6---");
        System.out.println(kyu8.areYouPlayingBanjo2("Gegor"));
        System.out.println(kyu8.areYouPlayingBanjo2("Regor"));
        System.out.println(kyu8.areYouPlayingBanjo2("regor"));
        System.out.println(kyu8.areYouPlayingBanjo("Gegor"));
        System.out.println(kyu8.areYouPlayingBanjo("gegor"));
        System.out.println(kyu8.areYouPlayingBanjo("regor"));

        System.out.println("---Kata 5---");
        System.out.println(kyu8.countingSheep(0));
        System.out.println(kyu8.countingSheep(1));
        System.out.println(kyu8.countingSheep(2));
        System.out.println(kyu8.countingSheep(3));

        System.out.println("---Kata 4---");
        System.out.println(kyu8.updateLight("red"));
        System.out.println(kyu8.updateLight("green"));
        System.out.println(kyu8.updateLight("yellow"));

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
