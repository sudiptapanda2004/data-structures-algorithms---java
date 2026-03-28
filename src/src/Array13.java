// Printing sub-arrays - continuous part of a array with sum, maxSum and minSum

public static void printSubarrays(int numbers[]) {
    int ts = 0;                             // ts = n*(n+1)/2
    int largestSum = Integer.MIN_VALUE;     // initializing with +infinity
    int smallestSum = Integer.MAX_VALUE;    // initializing with -infinity

    for (int i=0; i< numbers.length; i++) {
        // int start = numbers[i];          // for beginners
        for (int j=i; j<numbers.length; j++) {
            // int end = numbers[j];        // for beginners
            System.out.print("[");          // array starting bracket for output format

            int sum = 0;                    // reset sum for each sub-array


            for (int k=i; k<=j; k++) {      // this loop's task is only to print

                sum += numbers[k];     // calculation and accumulation of each new sum

                System.out.print(numbers[k]);
                if (k < j) System.out.print(" ");   // space in between for output format
            }
            if (sum > largestSum) {
                largestSum = sum;
            }
            if (sum < smallestSum) {
                smallestSum = sum;
            }

            ts++;
            System.out.println("]");        // array ending bracket for output format
            System.out.println("Sum of this sub-array : "+sum);     // sum of each sub-array is printed
        }
        System.out.println();
    }
    System.out.println("The total no. of sub-arrays printed are : "+ts);
    System.out.println("The largest sum of the above sub-arrays is : "+largestSum);
    System.out.println("The smallest sum of the above sub-arrays is : "+smallestSum);

}

void main() {
    int numbers[] = {1,2,3,4,5};

    System.out.println("A");
    printSubarrays(numbers);
}