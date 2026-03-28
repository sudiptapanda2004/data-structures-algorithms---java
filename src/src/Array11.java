// Pairs in an array

public static void printPairs(int numbers[]) {
    int totPairs = 0;                               // totPairs = n*(n-1)/2
    for (int i=0; i< numbers.length; i++) {
        int current = numbers[i];  // 2,4,6,8,10
        for (int j=i+1; j< numbers.length; j++) {
            System.out.print("("+current+","+numbers[j]+")");
            totPairs++;
        }
        System.out.println();
    }
    System.out.println("Total no. of pairs printed are : "+totPairs);
}

void main() {
    Scanner sc = new Scanner(System.in);

    // int[] numbers = new int[5];      # direct entered size of array

    System.out.print("Enter array size : ");
    int n = sc.nextInt();
    int[] numbers = new int[n];

    System.out.println("Enter " + n + " elements -");
    for (int a = 0; a < numbers.length; a++) {// Array user input for fixed-size array
        System.out.print("Enter element " + (a + 1) + " : ");  // See the output
        numbers[a] = sc.nextInt();
    }
    System.out.println("The array you entered : "+Arrays.toString(numbers));

    System.out.println("The pairs are : ");
    printPairs(numbers);
}