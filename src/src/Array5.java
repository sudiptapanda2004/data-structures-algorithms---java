// linear search

public static int linearSearch(int numbers[], int key) {
    for (int i=0; i<=numbers.length; i++) {
        if (numbers[i] == key) {
            return i;
        }
    }
    return -1;
}

void main() {
    int numbers[] = {3,7,9,8,10,15,17};
    int key = 10;

    int index = linearSearch(numbers, key);
    if (index == -1){
        System.out.println("Not Found");
    }
    else {
        System.out.println("Key is at index : " + index);
    }

}
