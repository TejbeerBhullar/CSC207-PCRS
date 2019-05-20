public class Factorial {
    public static int factorial(int n) {
        int ret = 1;
        if (n < 1){
            return 1;}
        else
        {for (int i = n; i > 0; i--){
            ret *= i;           }
        }
        return ret;
    }
}