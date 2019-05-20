import java.util.Scanner;

public class Echo{
    public static void echo() {
        Scanner in = new Scanner(System.in);
        if (in.hasNextLine()){
        String init = in.nextLine();
        while (in.hasNextLine() == true){
            init = in.nextLine();
            System.out.println(init);

        }
    }}
}