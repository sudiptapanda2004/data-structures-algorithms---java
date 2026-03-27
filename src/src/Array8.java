// largest & smallest numbers in an array
public  static int getLargest(int numbers[]) {
    int largest = Integer.MIN_VALUE;    // -infinity(-∞) in java
    // here we initialized largest with -∞
    int smallest = Integer.MAX_VALUE;   // +infinity(+∞) in java
    // here we initialized smallest with +∞

    for (int i=0; i< numbers.length; i++) {
        if (largest<numbers[i]) {
            largest = numbers[i];
        }
        if (smallest>numbers[i]) {
            smallest = numbers[i];
        }
    }
    System.out.println("The smallest is : "+smallest);
    return largest;
}

void main() {
    int numbers[] = {1,2,5,9,13,17,12,19,9,8};

    int largest = getLargest(numbers);
    System.out.println("The largest is : "+largest);
}