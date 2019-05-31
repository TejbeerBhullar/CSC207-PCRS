public class loops {
    public static int oddSum(int[] arr) {
        int sum = 0;
        for(int i: arr){
            --i;
            if (i%2==1){
                sum += arr[i];
                //System.out.println(arr[i]); //- Test 1
                }

        }
         System.out.println(sum); //- Test 2
            return sum;

    }



}

