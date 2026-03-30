// Max Sum of Sub-Array using Kadane's Algorithm

public static void kadaneMaxSum(int numbers[]) {
    int maxSum = Integer.MIN_VALUE;
    int curSum = 0;
    int maxElement = Integer.MIN_VALUE;          // ← ADDED: tracks the largest element

    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] > maxElement) {           // ← ADDED
            maxElement = numbers[i];             // ← ADDED: update if current is greater
        }                                        // ← ADDED

        curSum = curSum + numbers[i];
        if (curSum < 0) {
            curSum = 0;
        }
        maxSum = Math.max(curSum, maxSum);
    }

    if (maxSum == 0) {                           // ← ADDED: all elements were negative
        maxSum = maxElement;                     // ← ADDED: the least negative is the answer
    }                                            // ← ADDED

    System.out.println("The max sub-array sum is : " + maxSum);

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
    System.out.println("The array you entered : " + Arrays.toString(numbers) + "\n");

    kadaneMaxSum(numbers);

}