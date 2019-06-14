import java.util.Scanner;

public class Echo {
    public static void echo() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String aLong = sc.nextLine();
            System.out.println(aLong);
        }

    }
}