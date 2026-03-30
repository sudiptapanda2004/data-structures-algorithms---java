// Max Sub-Array Sum using Prefix Sum

public static void maxSum(int numbers[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;     // initializing with +infinity
    // int smallestSum = Integer.MAX_VALUE;    // initializing with -infinity

    int prefix[] = new int[numbers.length];
    prefix[0] = numbers[0];
    // calculate prefix array
    for (int i=1; i<prefix.length; i++) {
        prefix[i] = prefix[i-1] + numbers[i];
    }

    for (int i = 0; i < numbers.length; i++) {
        int start = i;
        for (int j = i; j < numbers.length; j++) {
            int end = j;
            // System.out.print("[");          // array starting bracket for output format

            currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1] ;


            /* for (int k = i; k <= j; k++) {      // this loop's task is only to print

                sum += numbers[k];     // calculation and accumulation of each new sum

                System.out.print(numbers[k]);
                if (k < j) System.out.print(" ");   // space in between for output format
            } */

            if (maxSum < currSum) {
                maxSum = currSum;
            }
            /* if (sum < smallestSum) {
                smallestSum = sum;
            } */


            // System.out.println("]");        // array ending bracket for output format
            //System.out.println("] -> Sum of this sub-array : " + currSum);     // sum of each sub-array is printed
        }
        //System.out.println();
    }
    System.out.println("The largest sum of the above sub-arrays is : " + maxSum);
    // System.out.println("The smallest sum of the above sub-arrays is : " + smallestSum);

}

void main() {
    Scanner sc = new Scanner(System.in);

    // int[] numbers = new int[5];      # direct entered size of array

    System.out.print("Enter array size : ");
    int n = sc.nextInt();
    int[] numbers = new int[n];

    System.out.println("Enter " + n + " elements -");
    for (int a = 0; a < numbers.length; a++) {                 // Array user input for fixed-size array
        System.out.print("Enter element " + (a + 1) + " : ");  // See the output
        numbers[a] = sc.nextInt();
    }
    System.out.println("The array you entered : "+Arrays.toString(numbers)+"\n");

    maxSum(numbers);
}