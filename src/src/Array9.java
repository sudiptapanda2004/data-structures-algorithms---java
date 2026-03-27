// binary search in array

public static int binarySearch(int numbers[], int key) {
    int start = 0, end = numbers.length-1;

    while (start<=end) {
        int mid = (start+end)/2;

        if (numbers[mid]==key){
            return mid;
        }
        if (numbers[mid]<key){
            start=mid+1;
        }
        else {
            end=mid-1;
        }
    }
    return -1;
}

void main() {
    int numbers[] = {1,2,3,4,5,6,7,8,9};
    int key = 6;

    int a = binarySearch(numbers, key);
    System.out.println("The number is at index : "+a);
}