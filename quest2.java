import java.time.MonthDay;
import java.util.Comparator;
import java.util.Arrays ;

public class quest2 {


    public static void main(String[] arg){

        int[] ages = {10, 24, 3, 45, 83, 9};
        Arrays.sort(ages);

        // Create some MonthDay objects and put them in an array.
        // This class does not provide any constructors.  Instead, we
        // call static method "of" to make an instance.

        MonthDay md1 = MonthDay.of(1, 5);
        MonthDay md2 = MonthDay.of(7, 24);
        MonthDay md3 = MonthDay.of(7, 24);
        MonthDay md4 = MonthDay.of(1, 28);
        MonthDay md5 = MonthDay.of(2, 14);
        MonthDay[] dates = {md1, md2, md3, md4, md5};

        // Because MonthDay implements Comparable, we can call sort,
        // which depends on that:
//        System.out.println(Arrays.deepToString(dates));
        Arrays.sort(dates);
//        System.out.println(Arrays.deepToString(dates));
//
//        System.out.println(md1.compareTo(md2)); // -6
//        System.out.println(md2.compareTo(md1)); //  6
//        System.out.println(md2.compareTo(md3)); //  0


        Review r1 = new Review("Emoji Movie", 10,
                "Cinematic malware");
        Review r2 = new Review("Dunkirk", 95,
                "Gifted ensemble cast and masterful direction");
        Review r3 = new Review("Spider Man: Homecoming", 95,
                "A fun adventure");
        Review r4 = new Review("My Neighbour Totoro", 99,
                "A work of art");
        Review r5 = new Review("Despicable Me3", 60,
                "Zany but scattershot humour");



        System.out.println(r1.compareTo(r2)); // -1
        System.out.println(r2.compareTo(r1)); //  1
        System.out.println(r2.compareTo(r3)); //  0



        Review[] badFruit = {r1, r2, r3, r4, r5};
        Arrays.sort(badFruit);
        for (int i = 0; i < badFruit.length; i++) {
            System.out.println(badFruit[i]);
        }


    }
}



